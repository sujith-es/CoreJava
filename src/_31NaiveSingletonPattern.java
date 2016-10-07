
public class _31NaiveSingletonPattern {

	private static _31NaiveSingletonPattern instance;

	private _31NaiveSingletonPattern() {

	}

	public static synchronized _31NaiveSingletonPattern getInstance() {
		if (instance == null) {
			instance = new _31NaiveSingletonPattern();
		}
		return instance;
	}

}
