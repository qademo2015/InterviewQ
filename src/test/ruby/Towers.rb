
def hanoi(n, a, b, c)
  if n > 1
    hanoi(n-1, a, c, b)
    puts "#{a} -> #{b}"
    hanoi(n-1, c, b, a)
  else
    puts"#{a} -> #{b}"
  end
end

мсиваеиваеирвке

hanoi(6, "a", "b", "c")
#hanoi(1, "a", "b", "c")