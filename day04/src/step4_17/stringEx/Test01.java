package step4_17.stringEx;

public class Test01 {

	public static void main(String[] args) {
		
		String nameData = "";
		nameData+=	"100001/이만수";nameData += "\n";		
		nameData += "100002/이영희";nameData += "\n";
		nameData += "100003/유재석";nameData += "\n";
		nameData += "100004/박명수";nameData += "\n";
		nameData += "100005/최여정";nameData += "\n";
		nameData += "100006/박병욱";
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";
		
		// 문제) moneyData 와 nameData 를 조합
		
		
		String[][]tokens = new String [nameData.split("\n").length][2];
		
		for (int i = 0; i < nameData.split("\n").length; i++) {
			tokens[i][0] = nameData.split("\n")[i].split("/")[0];
			tokens[i][1] = nameData.split("\n")[i].split("/")[1];
		}
		
		String [][]tokens2 = new String [moneyData.split("\n").length][2];
		
		for (int i = 0; i < moneyData.split("\n").length; i++) {
			tokens2[i][0] = moneyData.split("\n")[i].split("/")[0];
			tokens2[i][1] = moneyData.split("\n")[i].split("/")[1];
		}
		
		for (int i = 0; i < tokens2.length; i++) {
			int ind = -1;
			for (int j = 0; j < tokens.length; j++) {
				if (tokens2[i][0].equals(tokens[j][0])) ind = j;
			}
			System.out.println(tokens2[i][0] + "/" + tokens[ind][1] + "/" + tokens2[i][1]);
		}
	}
}
