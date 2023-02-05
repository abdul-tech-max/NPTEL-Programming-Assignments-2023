n = int(input())

l = []
s = []

count = -1

for i in range(n):
  
  t = input().split()
  l.append(t)
  s.append(0)

for i in l:
  
  L, U = i
  L = int(L)
  U = int(U)
  count += 1
  
  for j in l:
    
    L2, U2 = j
    L2 = int(L2)
    U2 = int(U2)
    
    if (L == L2 and U == U2):
      continue
    
    if (L < L2 and U > U2):
      s[count] += 2
      
  
for z in s:
  print(str(z), end = " ")

print("\n", end ="")
  
