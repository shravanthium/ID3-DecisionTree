
##ID3 - Decision Tree Algorithm:

1.Calculate the entropy of every attribute using the data set S 
2.Split the set S into subsets using the attribute for which entropy is minimum (or, equivalently, information gain is maximum) 
3.Make a decision tree node containing that attribute 
4.Recur on subsets using remaining attributes. 

####Entropy: 
![](http://upload.wikimedia.org/math/4/e/8/4e86dff5b536e91be75130c4dbc0139d.png)

Where,
S - The current (data) set for which entropy is being calculated (changes every iteration of the ID3 algorithm)
X - Set of classes in S
p(x) - The proportion of the number of elements in class x to the number of elements in set S

####Information Gain: 
![](http://upload.wikimedia.org/math/8/0/e/80e72df728596b58cf508712e87d5d1a.png)

Where,

H(S) - Entropy of set S
T - The subsets created from splitting set S by attribute A such that S = \bigcup_{t \in T} t
p(t) - The proportion of the number of elements in t to the number of elements in set S
H(t) - Entropy of subset t

## Cancer Prediction System

A Simple ID3 Decision Tree implementation to predict whether a person is likely to get affected 
by cancer based on set of inputs.
