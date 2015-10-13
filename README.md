# Clojure Tutorial

Clojure tutorial in Bahasa Indonesia (video version)  

This tutorial assumes you have an introductory programming background (preferrably using Haskell).
If you don't then try [this one](https://github.com/Zenius2016/BoardAlfa). Why Clojure? [here](http://www.infoq.com/presentations/Simple-Made-Easy).

## Youtube Playlists (Table of Contents):

1. [Data Types & Lexical Scope](https://youtu.be/NXxJavT7ILY?list=PLlTjr2CPUG1-tA4FMIGCCyJFGuZbB-gpq)  
 1.1 [Installation & Clojure Introduction](https://www.youtube.com/watch?v=NXxJavT7ILY&feature=youtu.be&list=PLlTjr2CPUG1-tA4FMIGCCyJFGuZbB-gpq)   
 1.2 [Basic Data Types & Operations](https://www.youtube.com/watch?v=h-e5epfgGp0&list=PLlTjr2CPUG1-tA4FMIGCCyJFGuZbB-gpq&index=2)  
 1.3 [Collections (List, Vector, Maps, Set)](https://www.youtube.com/watch?v=7uRzGD8h8b8&index=3&list=PLlTjr2CPUG1-tA4FMIGCCyJFGuZbB-gpq)  
 1.4 [Symbols & Identifier](https://www.youtube.com/watch?v=PRfFqxHJqYY&list=PLlTjr2CPUG1-tA4FMIGCCyJFGuZbB-gpq&index=4)  
 1.5 [Exercise 1: Expression](https://www.youtube.com/watch?v=Q-Q5ViMOkeE&index=5&list=PLlTjr2CPUG1-tA4FMIGCCyJFGuZbB-gpq)  
 1.6 [Exercise 2: List Manipulation ](https://www.youtube.com/watch?v=8F6lRTbePGA&list=PLlTjr2CPUG1-tA4FMIGCCyJFGuZbB-gpq&index=6)  
 1.7 [Exercise 3: Vector Manipulation](https://www.youtube.com/watch?v=3tM3P4_hz-c&index=7&list=PLlTjr2CPUG1-tA4FMIGCCyJFGuZbB-gpq)  
 1.8 [Exercise 4: Set and Maps ](https://www.youtube.com/watch?v=jHBexy6tVXU&list=PLlTjr2CPUG1-tA4FMIGCCyJFGuZbB-gpq&index=8)  
 &nbsp;&nbsp;&nbsp;&nbsp;1.8.1 [`hash-map`](https://youtu.be/jHBexy6tVXU?t=0s)  
 &nbsp;&nbsp;&nbsp;&nbsp;1.8.2 [`count`](https://youtu.be/jHBexy6tVXU?t=8m42s)  
 &nbsp;&nbsp;&nbsp;&nbsp;1.8.3 [`assoc`](https://youtu.be/jHBexy6tVXU?t=10m48s)  
 &nbsp;&nbsp;&nbsp;&nbsp;1.8.4 [`dissoc`](https://youtu.be/jHBexy6tVXU?t=13m09s)  
 &nbsp;&nbsp;&nbsp;&nbsp;1.8.5 [`list`](https://youtu.be/jHBexy6tVXU?t=13m36s)  
 1.9 [Exercise 5: Defining a Function](https://www.youtube.com/watch?v=g5EqfyzuYl8&index=9&list=PLlTjr2CPUG1-tA4FMIGCCyJFGuZbB-gpq)  
 &nbsp;&nbsp;&nbsp;&nbsp;1.9.1  [Function can beget another](https://youtu.be/g5EqfyzuYl8?list=PLlTjr2CPUG1-tA4FMIGCCyJFGuZbB-gpq&t=8m49s)  
 &nbsp;&nbsp;&nbsp;&nbsp;1.9.2 [Higher-order function take function arguments](https://youtu.be/g5EqfyzuYl8?t=16m16s)
2. [Recursions](https://www.youtube.com/watch?v=KLgrUWyqGgw&feature=youtu.be&list=PLlTjr2CPUG187bvI0lY00K6n1GVbyFLdU)  
2.1 [How to Make Clojure File](https://www.youtube.com/watch?v=KLgrUWyqGgw&feature=youtu.be&list=PLlTjr2CPUG187bvI0lY00K6n1GVbyFLdU)  
2.2 [4Clojure  Introduction](https://www.youtube.com/watch?v=ihX2k1Ig2q0&index=2&list=PLlTjr2CPUG187bvI0lY00K6n1GVbyFLdU)  
2.3 [Conditional (`if` and `cond`) ](https://youtu.be/o8wqw7A1xj8?t=1m15s)  
2.4 [Conditional Continue & Collections](https://www.youtube.com/watch?v=MhoS_U8eg10&index=4&list=PLlTjr2CPUG187bvI0lY00K6n1GVbyFLdU)  
 &nbsp;&nbsp;&nbsp;&nbsp;2.4.1 [Truthy & Falsy](https://youtu.be/MhoS_U8eg10)  
 &nbsp;&nbsp;&nbsp;&nbsp;2.4.2 [4Clojure's Collection Problems](https://youtu.be/MhoS_U8eg10?t=2m15s)  
2.5 [Clojure Evaluation 1](https://www.youtube.com/watch?v=EyCbsZ-mVmI&index=5&list=PLlTjr2CPUG187bvI0lY00K6n1GVbyFLdU)  
2.6 [Clojure Evaluation 2](https://www.youtube.com/watch?v=v8edssoaXuo&index=6&list=PLlTjr2CPUG187bvI0lY00K6n1GVbyFLdU)  
2.7 [Recursion 1: Factorial](https://www.youtube.com/watch?v=VBqGy5E0LwY&list=PLlTjr2CPUG187bvI0lY00K6n1GVbyFLdU&index=7)  
2.8 [Recursion 2 ](https://www.youtube.com/watch?v=D4gft10cC_E&index=8&list=PLlTjr2CPUG187bvI0lY00K6n1GVbyFLdU)  
 &nbsp;&nbsp;&nbsp;&nbsp;2.8.1 [Sum & Drop](https://youtu.be/D4gft10cC_E)  
 &nbsp;&nbsp;&nbsp;&nbsp;2.8.2 [Destructuring](https://youtu.be/D4gft10cC_E?t=5m6s) (`[[x & xs]]` or `[[x & xs :as lst] (range 10)]`)
3. [`loop` & `recur`](https://www.youtube.com/watch?v=74lhwCaL5_g&list=PLlTjr2CPUG18iBKGdoSQQsoJJeErVrqyY)  
3.1 [Clojure Expression](https://www.youtube.com/watch?v=74lhwCaL5_g&list=PLlTjr2CPUG18iBKGdoSQQsoJJeErVrqyY)  
3.2 [Data Structure](https://www.youtube.com/watch?v=IoJ22_Ro4M4&index=2&list=PLlTjr2CPUG18iBKGdoSQQsoJJeErVrqyY)  
3.3 [`if` Conditional](https://www.youtube.com/watch?v=w7CR_rDC7tQ&list=PLlTjr2CPUG18iBKGdoSQQsoJJeErVrqyY&index=3)    
3.4 [Recursion](https://www.youtube.com/watch?v=u6IDIX1rJV4&list=PLlTjr2CPUG18iBKGdoSQQsoJJeErVrqyY&index=4)  
3.5 [True and False Conditional](https://www.youtube.com/watch?v=yE3mU5b8rBs&list=PLlTjr2CPUG18iBKGdoSQQsoJJeErVrqyY&index=5)  
3.6 [Brute-force Prime](https://www.youtube.com/watch?v=GaeIDpdfpc0&index=6&list=PLlTjr2CPUG18iBKGdoSQQsoJJeErVrqyY)  
3.7 [Efficient Prime Algorithm ](https://www.youtube.com/watch?v=oiXewIUjGVg&index=7&list=PLlTjr2CPUG18iBKGdoSQQsoJJeErVrqyY)  
3.8 [Pure Recursion & Looping](https://www.youtube.com/watch?v=oLmamghbW_g&list=PLlTjr2CPUG18iBKGdoSQQsoJJeErVrqyY&index=8)
4. [Higher Order Functions & List Comprehensions](https://www.youtube.com/playlist?list=PLlTjr2CPUG185iOkewp5i-uVoflhSrw_z)  
4.1 [Idiomatic Clojure](https://www.youtube.com/watch?v=9rHL8yTWZQo&list=PLlTjr2CPUG185iOkewp5i-uVoflhSrw_z&index=1)   
4.2 [Pattern `->` & `->>`](https://www.youtube.com/watch?v=25Xs7OdkQqk&list=PLlTjr2CPUG185iOkewp5i-uVoflhSrw_z&index=2)  
4.3 [Pattern `map-indexed`, `keep`, & `filter`](https://www.youtube.com/watch?v=kH9m9h08090&index=3&list=PLlTjr2CPUG185iOkewp5i-uVoflhSrw_z)  
4.4 [Global & Local Scope](https://www.youtube.com/watch?v=h5rSmJmn_U4&index=4&list=PLlTjr2CPUG185iOkewp5i-uVoflhSrw_z)  

Special playlist(s) :

1. <a href="https://www.youtube.com/playlist?list=PLlTjr2CPUG19Yq3XMnjfquTQdltu2QOOM" target="_blank">Using Paredit to boost productivity</a> (VERY IMPORTANT!).  

Important exercises :

1. <a href="http://www.4clojure.com" target="_blank">4Clojure</a>  
2. <a href="http://www.projecteuler.net" target="_blank">Euler</a>  

Other learning resources :

1. <a href="https://clojuredocs.org/quickref" target="_blank">Clojure cheat-sheet</a>  
2. <a href="http://clojure-doc.org/articles/content.html" target="_blank">Clojure community tutorial</a>  
3. <a href="http://www.braveclojure.com" target="_blank">Clojure for the brave and true</a>  


Easy/Quick installation :

1. [JDK 1.8](http://www.java.com/en/download/manual.jsp)  
2. [Download nightcode](https://sekao.net/nightcode/)
3. If you need an advanced Clojure IDE, try Emacs+cider+paredit or IntelliJ with Cursive for a much more productive workflow and better integration with Paredit + Java environment (IntelliJ)
