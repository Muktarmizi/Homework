package coddingChallenge1;

/*
Que: Print your name vertically but reverse [They will not mention: character by character]


first index = 0
second index = 1
last index = ?

# Array
{11, 32, 13, 4, 45}
i [0] = 11
i [1] = 32
i [4] = 45
=> i[5-1] = 45
=> i[i.length-1] = 45 

i.length-1          is the last index for Array

s.length()-1         is the last index of a String

Input: Tofael Kabir
Output:
r
i
b
a
K

l
e
a
f
o
T

*/

public class A04_characterOneByOneVerticallyButReverse {

	public static void inVerticallyReverse(String s) {

		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.println(s.charAt(i));

		}

	}

	public static void main(String[] args) {

		inVerticallyReverse("Tofael Kabir");
	}

}
