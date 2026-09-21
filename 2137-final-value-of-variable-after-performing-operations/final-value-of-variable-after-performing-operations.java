class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for(String operation : operations){
            if(operation.equals("--X") || operation.equals("X--")){
                x--;
            }else{
                x++;
            }
        }
        return x;
    }
}

//         int n = sc.nextInt();
//         int x = 0;
//         for(int i = 0; i<n; i++){
//             String s = sc.nextInt();
//             if(s.contains("+")){
//                 x++;
//             }else{
//                 x--;
//             }
//         }
//         return x;
//     }
// }

        
              //  int n = sc.nextInt();
       // int x = 0;
      //  sc.nextLine();
       // while(n-- != 0){
            //String s = sc.nextLine();
           // if(x.charAt(0) == '+' || s.charAt(2) == '+'){
          //      x = x+1;
          //  }
          //  else{
          //      x = x-1;
        //  }
//         }
//         return x;
        
//     }
// }