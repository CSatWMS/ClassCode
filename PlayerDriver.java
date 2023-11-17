public class PlayerDriver {
	public static void main(String[] args){
		Player rookie = new Player("dntpwnme");
		Player advanced = new Player("dominateU", 10, true);

		rookie.logOn();
		advanced.logOn();

		advanced.versus(rookie);
	}
}