package Sample.Interface;

public interface IDefaultInterface extends Runnable, AutoCloseable {

	@Override
	default void close() throws Exception {

	}

	@Override
	default void run() {

	}
}
