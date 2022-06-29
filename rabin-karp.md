# Rabin-Karp 1st Window hash
Let 0 to 25 represent lowercase alphabets and <b>N</b> be a large prime number to do modulus for hash, then to calculate the first window hash:

#### Let String be "xyz"

##### x = 23   
##### y = 24  
##### z = 25 

#### Finding Hash of 1st Window

#### In Pusedocode

  
    hash = int( string[0] ) mod N   // Refers to 0 - 25 of alphabets as in 1st line

     for ( i=1 ; i < window size ; i++ ){
          
          hash *= 26 mod N
          hash = hash mod N
          hash += int(string[i]) mod N
                      
     }
     
     hash = hash mod N ( To mod for last added i as loop will terminate after just adding i )

<h4> Dry Run on paper for string </h4>  <h3>xyz</h3>

![IMG_20220629_122305](https://user-images.githubusercontent.com/92201689/176371873-b978ad27-5e68-4beb-8a9a-a91aa244bdfd.jpg)

![IMG_20220629_122317](https://user-images.githubusercontent.com/92201689/176371890-c82adfe0-b2f8-4fbc-a270-68b80692825b.jpg)

