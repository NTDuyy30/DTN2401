package entity.generic;

public class MyMap<K, V> {
	private K key;
	private V value;

	public MyMap() {

	}

	public MyMap(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return this.key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return this.value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "MyMap [key=" + key + ", value=" + value + "]";
	}

}
