package entity.generic;

public class Phone<K, V> extends MyMap<K, V> {

	public Phone() {
		super();
	}

	public Phone(K key, V phoneNumber) {
		super(key, phoneNumber);
	}

	public V GetPhoneNumber() {
		return super.getValue();
	}

	@Override
	public K getKey() {
		return super.getKey();
	}
}
