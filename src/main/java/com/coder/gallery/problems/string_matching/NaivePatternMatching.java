//public class NaivePatternMatching{
//
//	public int match(String text, String pat){
//
//		int n = text.length;
//		int m = pat.length;
//		for(int i=0; i<=n-m; i++){
//			for(int j=0; j<m; j++){
//				if(text[i+j] != pat[j]){
//					break;
//				}
//			}
//			if(j == m){
//				System.out.println(i);
//			}
//		}
//	}
//}