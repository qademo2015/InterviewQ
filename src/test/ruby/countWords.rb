def split_sentence string
  pattern = /(\'|\"|\.|\*|\/|\-|\\)/
  words = string.downcase.gsub(pattern, "").split(" ")
end

def collect array
  words_hash = Hash.new
  array.each do |element|
    if words_hash.has_key? element
      words_hash[element]+= 1
    else
      words_hash[element] = 1
    end
  end
  words_hash
end

def count

end

def count_words string
  collect(split_sentence string)
end

p count_words "I'm professor Dorovskikh. And I am the professor in the world"

