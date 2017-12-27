package coin.batch;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import coin.batch.model.CoinVo;

public class BatchMain {
	public static void main(String ar[]) {
		AbstractApplicationContext ac = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		CoinVo cv = (CoinVo)ac.getBean("coinVo");
		
	}
}
