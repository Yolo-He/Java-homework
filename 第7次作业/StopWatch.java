package 第7次作业;
//9.6
public class StopWatch {
		private long startTime;
		private long endTime;
		
		public StopWatch() {
			this.startTime = System.currentTimeMillis();
		}
		
		public void start() {
			this.startTime = System.currentTimeMillis();
		}
		
		public void stop() {
			this.endTime = System.currentTimeMillis();
		}
		
		public long getElapsedTime() {
			return endTime - startTime;
		}
}
