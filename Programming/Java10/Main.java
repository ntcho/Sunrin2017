
public class Main implements Sports {
	public static void main(String args[]) {
		Sports sports = new Sports() {
			
			@Override
			public void setVisitingTeam(String teamName) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setHomeTeam(String teamName) {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

	@Override
	public void setHomeTeam(String teamName) {
		// TODO Auto-generated method stub
		System.out.println(teamName + " Enters");
	}

	@Override
	public void setVisitingTeam(String teamName) {
		// TODO Auto-generated method stub
		System.out.println(teamName + " Enters");
	}
}