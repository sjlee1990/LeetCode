##permutation 求数组的排列

permutation(n):
- null -----`if` n.length == 0 || n == null;
- n[0] -----`if` n.length == 1
- n[i] + permutation(m)  m是n剔除n[i]后的数组 -----`otherwise`
