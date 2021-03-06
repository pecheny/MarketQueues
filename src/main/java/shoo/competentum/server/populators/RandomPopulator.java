package shoo.competentum.server.populators;

import shoo.competentum.shared.Customer;
import shoo.competentum.shared.CustomerKind;

import java.util.Random;


/**
 * При каждом обращении к populate() создается новый экземпляр покупателя, тип и количество товаров которого выбираются случайно.
 */
public class RandomPopulator implements Populator {
	private static final Random RND = new Random();
	private static final int MAX_ITEMS = 10;

	public Customer populate() {
		CustomerKind[] values = CustomerKind.values();
		CustomerKind kind = values[RND.nextInt(values.length)];
		int items = RND.nextInt(MAX_ITEMS - 1) + 1;
		Customer customer = new Customer(items, kind);
		return customer;
	}
}
