
def hanoi(n, a, b, c)
  if n > 1
    hanoi(n-1, a, c, b)
    puts "#{a} -> #{b}"
    hanoi(n-1, c, b, a)
  else
    puts "#{a} -> #{b}"
  end
end

hanoi(2, "1", "2", "3")
#hanoi(1, "a", "b", "c")