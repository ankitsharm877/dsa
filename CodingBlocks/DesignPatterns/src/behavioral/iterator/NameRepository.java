package behavioral.iterator;

//The Iterator pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

//Example in Java: java.util.Iterator, java.util.Enumeration

//Aggregate Interface
interface Container {
	Iterator getIterator();
}

//Iterator Interface
interface Iterator {
	boolean hasNext();

	Object next();
}

//Concrete Aggregate
class NameRepository implements Container {
	public String names[] = { "John", "Jane", "Jack", "Jill" };

	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;

		public boolean hasNext() {
			return index < names.length;
		}

		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}

