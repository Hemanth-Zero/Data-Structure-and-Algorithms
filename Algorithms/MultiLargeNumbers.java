public class MultiLargeNumbers {
    public void algorithm(){
            /*      
                stoi(Sting A) return Integer A ;
                MultiLargeNumbers(String A,String B){
                    if( |A| < 5 && |b| < 5) 
                        return  (stoi(A)*stoi(b)).toString()
                    n = max(|A|,|B|)
                    m = n/2
                    a,b = split(A,m)
                    c,d = split(B,m)
                    P0 = MultiLargeNumbers(a,c)  -> T(n/2)
                    P2 = MultiLargeNumbers(b,d)  -> T(n/2)
                    P1 = MultiLargeNumbers(stradd(a,b),stradd(c,d))  ->T(n/2)

                    return Shift(P0,2m)+Shift(P1-P0-P2,m)+P2  ->(n)
                }

                total time complexity = 3T(n/2) + O(n) ~ O(n ^ log 3 base 2) ~O(n^1.58)
            */
    }
}