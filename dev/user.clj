(ns user)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn big
  "Tells you if the string is big or not."
  [st, n]
  (> (count st) n))

(defn collection-type
  "Returns the collection type as a keyword"
  [coll]
  (cond
    (instance? clojure.lang.PersistentVector coll) :vector
    (instance? clojure.lang.PersistentHashSet coll) :set
    (instance? clojure.lang.PersistentList coll) :list
    (instance? clojure.lang.PersistentArrayMap coll) :map))
