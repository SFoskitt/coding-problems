class Solution {
    public String mergeAlternately(String word1, String word2) {
       int len1 = word1.length();
       int len2 = word2.length();
       System.out.println("len1 " + len1);
       System.out.println("len2 " + len2);
       String suff = "";
       int sht = 0;
       if(len1 > len2 || len1 == len2){
        sht = len2;
        System.out.println("sht1 " + sht);
        suff = word2.substring(sht-1);
       } else {
        sht = len1;
        System.out.println("sht2 " + sht);
        suff = word1.substring(sht-1);
       }

       String[] arr1 = word1.split("");
       String[] arr2 = word2.split("");

       //ArrayList<String> rslt = new ArrayList<String>();
       String rslt = "";
       for(int i = 0; i < sht; i++) {
         //rslt.add(arr1[i]);
         //rslt.add(arr2[i]);
         rslt.join(arr1[i]);
         rslt.join(arr2[i]);
       }

       //String tmp = rslt.join();
       //System.out.println("tmp " + tmp);
       return rslt.concat(suff);
    }
}