package step4_17.stringEx;

public class Test01 {

	public static void main(String[] args) {
		
		String nameData = "";
		nameData+=	"100001/�̸���";nameData += "\n";		
		nameData += "100002/�̿���";nameData += "\n";
		nameData += "100003/���缮";nameData += "\n";
		nameData += "100004/�ڸ��";nameData += "\n";
		nameData += "100005/�ֿ���";nameData += "\n";
		nameData += "100006/�ں���";
		
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
		
		// ����) moneyData �� nameData �� ����
		
		
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
