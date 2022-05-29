# JavaEncryption
This project includes impelemenatation of Polibiusz and ROT13 algorithm which are used to crypt/decrypt information.

Project contains:

A Cryptographer class with the following fields and methods:
 -static cryptfile method, taking as parameters the file to be encrypted, the file in which the encrypted text should be saved, and references to the Algorithm type:
public void cryptfile (String path_to_file_in, String path_to_file_out, Algorithm algorithm)
 -the static decryptfile method works the opposite of cryptfile
public void decryptfile (String path_to_file_in, String path_to_file_out, Algorithm algorithm)

Interface Algoritm having the following methods:
 -crypt method that encrypts a single word and returns its encrypted form:
   public String crypt (String inputWord)
 -decrypt method that decrypts a single word and returns its decrypted form
   public String decrypt (String inputWord)

ROT and Polibiusz class implementing the Algorithm interface.


In ROT algorithm, the rotation is 11 instead of 13.
A full description of how the ciphers work can be found here:
- https://en.wikipedia.org/wiki/ROT13
- https://en.wikipedia.org/wiki/Polybius_square
