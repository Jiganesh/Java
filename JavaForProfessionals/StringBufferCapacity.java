public class StringBufferCapacity {
    public static void main(String[] args) {

        StringBuffer string = new StringBuffer("Learn ");

        int lengthOfString = string.length(); //lengthOfString = 6

        int currentcapacity = string.capacity(); // currentCapacity = 22;
        string.ensureCapacity(25);
        int newcapacity = string.capacity(); // newCapacity = 46;

        System.out.printf("%d %d %d",lengthOfString, currentcapacity, newcapacity);

    }
}

// The length is the character count of the sequence of characters .

/*
 * The capacity is the amount of storage available for newly inserted,
 * characters, beyond which an allocation will occur.
 */

/*
 * ensureCapacity() method ensures that the capacity is at least equal to the
 * specified minimum . If the current capacity is less than the argument , then
 * a new internal array is allocated with greater capacity .
 */