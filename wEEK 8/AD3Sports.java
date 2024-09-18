import java.util.Scanner;
interface sports{
    void getGoals();
    void DispTeam(Football t);
}

class Football implements sports{
    Scanner sc = new Scanner(System.in);
    String team;
    int goals;

    Football(String team){
        this.team=team;
    }

    public void getGoals(){
        System.out.println("The Goals scored by team" +team+" is:");
        this.goals = sc.nextInt();
    }
    
    public void DispTeam(Football t)
    {
        if(this.goals > t.goals){
            System.out.println("Winner:"+team);
        }
        else if(this.goals < t.goals){
            System.out.println("Winner:"+t.team);
        }
        else{
            System.out.println("Tie");
        }

    }

}

class AD3Sports {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter home team name:");
        String team1 = sc.nextLine();
        System.out.println("Enter away team name:");
        String team2 = sc.nextLine();

        Football A = new Football(team1);
        A.getGoals();
        Football B = new Football(team2);
        B.getGoals();
        B.DispTeam(A);
    }
}
