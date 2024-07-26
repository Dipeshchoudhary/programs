package dipesh;

public class a4b3c2d1Printaaaabbbccd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube- https://www.google.com/search?q=java+program+to+take+input+a4b3c2d1+and+output+aaaabbbccd&sca_esv=2cbadb9ddcb4cafd&sca_upv=1&sxsrf=ADLYWILAJ4NQVrvM5JUNQfHw01gwmcfgmA%3A1714991671814&ei=N7I4ZuSqMdrD1e8Py4KV-AU&ved=0ahUKEwikopDr6fiFAxXaYfUHHUtBBV8Q4dUDCBA&uact=5&oq=java+program+to+take+input+a4b3c2d1+and+output+aaaabbbccd&gs_lp=Egxnd3Mtd2l6LXNlcnAiOWphdmEgcHJvZ3JhbSB0byB0YWtlIGlucHV0IGE0YjNjMmQxIGFuZCBvdXRwdXQgYWFhYWJiYmNjZDIHECEYoAEYCkiXogRQtYoBWKOdBHAZeACQAQCYAYECoAH5aKoBBzAuNzEuMTG4AQPIAQD4AQGYAkSgAr9BqAIUwgIHECMYJxjqAsICBxAuGCcY6gLCAhMQABiABBhDGLQCGIoFGOoC2AEBwgIWEAAYAxi0AhjlAhjqAhiMAxiPAdgBAsICFhAuGAMYtAIY5QIY6gIYjAMYjwHYAQLCAgoQIxiABBgnGIoFwgIKEAAYgAQYQxiKBcICFhAuGIAEGLEDGNEDGEMYgwEYxwEYigXCAgsQABiABBixAxiDAcICCBAuGIAEGOUEwgIIEAAYgAQYsQPCAg4QABiABBiRAhixAxiKBcICExAuGIAEGLEDGEMYgwEY5QQYigXCAhAQLhiABBixAxhDGOUEGIoFwgINEAAYgAQYsQMYQxiKBcICBRAAGIAEwgILEC4YgAQY0QMYxwHCAgYQABgFGB7CAgQQABgewgIGEAAYHhgPwgIIEAAYgAQYogTCAggQABiiBBiJBcICBBAhGArCAgUQIRigAZgDFLoGBggBEAEYAboGBggCEAEYC5IHBzE5LjQwLjmgB5W3Aw&sclient=gws-wiz-serp#fpstate=ive&vld=cid:2b8ff037,vid:arcuBpI6l7k,st:0
		//ip- a4b3c2d1
		//op=aaaabbbccd
		
		String str="a4b3c2d1";
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				int x=Character.getNumericValue(str.charAt(i));
				
				for(int j=1;j<x;j++)
				{
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}

}
