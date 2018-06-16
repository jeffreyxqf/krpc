package krpc.rpc.cluster.lb;

import java.util.List;
import java.util.Random;

import com.google.protobuf.Message;

import krpc.rpc.cluster.Addr;
import krpc.rpc.cluster.LoadBalance;
import krpc.rpc.core.ClientContextData;

public class RandomWeightLoadBalance implements LoadBalance {
	
	Random rand = new Random();
	
	public int select(List<Addr> addrs,ClientContextData ctx,Message req) {
		
		int[] weights =new int[addrs.size()]; // weight may be changed during select
		for(int i=0;i<weights.length;++i) {
			weights[i] = addrs.get(i).getWeight(ctx.getMeta().getServiceId());
		}
		
		int total = 0;
		boolean same = true;

		for(int i=0;i<weights.length;++i) {
			total += weights[i];
			if( same && i >= 1 ) {
				if( weights[i] != weights[i-1] ) same = false;
			}
		}
		
		if( total == 0 || same ) {
			return rand.nextInt(weights.length);
		}

		return select(weights,total);
	}
	
	public int select(int[] weights,int total) {
		int offset = rand.nextInt(total);
		for(int i=0;i<weights.length;++i) {
			offset -= weights[i];
			if( offset < 0 ) return i;
		}
		
		return 0; // impossible
	}

}