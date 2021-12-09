//   public class PattternWithGapChar{
//
//   	public int match(String text, String pat){
//
//   		int n = text.length;
//   		int m = pat.length;
//
//   		int i=0;
//   		int j=0;
//
//   		while(i <= n-m){
//   			while(j<m){
//   				if(pat[j] == "*"){
//   					j++;
//   					while(i<=n-m){
//   						if(pat[j] != text[i+j]){
//   							break;
//   						}
//   						i++;
//   					}
//   				}
//   				if(text[i+j] != pat[j]){
//   					break;
//   				}
//   				if(j == m){
//   					System.out.println(i);
//   				}
//   			}
//   		}
//   	}
//   };