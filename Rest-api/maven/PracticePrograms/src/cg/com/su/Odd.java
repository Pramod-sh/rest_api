package cg.com.su;


public class Odd {

	public static void main(String[] args) {
		
		int total_num = 0;
		for(int i = 1; i<10000000; i++) {
			if (isOdd(i)) {
				++total_num;
			}
		}
		System.out.println("Total number of Odd is:" + total_num);
		
	}
static boolean isOdd(int number) {
	int digit_count = 0, count = 0, previous = 0, current = 0, digit, substraction_done = 0, original_number;
	original_number = number;
	while(number != 0) {
		digit = number % 10;
		number = number / 10;
		previous = current;
		current = digit;
		++digit_count;
		++count;
		if(count == 2) {
			count = 0;
			++substraction_done;
			int diff;
			diff = Math.abs(current - previous);
			if(diff != 1) {
				return false;
			}
		}
	}
	if(digit_count == substraction_done * 2) {
		return isPrime(original_number);
	}
	else {
		return false;
	}
}

static boolean isPrime(int number) {
	for(int j=2; j <= number/2; j++) {
	    if(number % j == 0){
		return false;
	
	    }
	}

System.out.println(number + "is a Odd");
	return true;
}
}
