{:namespaces
 ({:source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed-api.html",
   :name "clojure.core.typed",
   :doc
   "This namespace contains typed wrapper macros, type aliases\nand functions for type checking Clojure code. check-ns is the interface\nfor checking namespaces, cf for checking individual forms."}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.async-api.html",
   :name "clojure.core.typed.async",
   :doc
   "This namespace contains annotations and helper macros for type\nchecking core.async code. Ensure clojure.core.async is require'd\nbefore performing type checking.\n\ngo\n  use go\n\nchan\n  use chan\n\nbuffer\n  use buffer (similar for other buffer constructors)\n"}
  {:source-url
   "https://github.com/clojure/core.typed/blob/bb332dc75a9bb02fe9fd000f4bd82738f9cca660/module-check/src/main/clojure/clojure/core/typed/base_env_common.clj",
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.base-env-common-api.html",
   :name "clojure.core.typed.base-env-common",
   :doc "Utilities for all implementations of the type checker"}
  {:source-url
   "https://github.com/clojure/core.typed/blob/0811ef9321f62be1ebab83c04b0f99620fd8e81e/module-check/src/main/clojure/clojure/core/typed/check_form_cljs.clj",
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.check-form-cljs-api.html",
   :name "clojure.core.typed.check-form-cljs",
   :doc nil}
  {:source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/check_ns_clj.clj",
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.check-ns-clj-api.html",
   :name "clojure.core.typed.check-ns-clj",
   :doc nil}
  {:source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/collect_utils.clj",
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.collect-utils-api.html",
   :name "clojure.core.typed.collect-utils",
   :doc nil}
  {:source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/hole.clj",
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.hole-api.html",
   :name "clojure.core.typed.hole",
   :doc
   "This namespace contains easy tools for hole driven development"}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.macros-api.html",
   :name "clojure.core.typed.macros",
   :doc nil}
  {:source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/statistics.clj",
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.statistics-api.html",
   :name "clojure.core.typed.statistics",
   :doc nil}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.util-vars-api.html",
   :name "clojure.core.typed.util-vars",
   :doc nil}),
 :vars
 ({:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ASeq",
   :namespace "clojure.core.typed",
   :forms [(ASeq t)],
   :var-type "type alias",
   :doc
   "A sequential seq returned from clojure.core/seq\n\n(TFn\n [[x :variance :covariant]]\n (I\n  (clojure.lang.ISeq x)\n  clojure.lang.Sequential\n  (Iterable x)\n  (java.util.Collection x)\n  (java.util.List x)\n  clojure.lang.IObj))",
   :name "ASeq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/AVec",
   :namespace "clojure.core.typed",
   :forms [(AVec t)],
   :var-type "type alias",
   :doc
   "A persistent vector returned from clojure.core/vector (and others)\n\n(TFn\n [[x :variance :covariant]]\n (I\n  (clojure.lang.IPersistentVector x)\n  (java.lang.Iterable x)\n  (java.util.Collection x)\n  (java.util.List x)\n  clojure.lang.IObj))",
   :name "AVec"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Agent1",
   :namespace "clojure.core.typed",
   :forms [(Agent1 t)],
   :var-type "type alias",
   :doc
   "An agent that can read and write type x.\n\n(TFn [[x :variance :invariant]] (clojure.lang.Agent x x))",
   :name "Agent1"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Agent2",
   :namespace "clojure.core.typed",
   :forms [(Agent2 t t)],
   :var-type "type alias",
   :doc
   "An agent that can write type w and read type r.\n\n(TFn\n [[w :variance :contravariant] [r :variance :covariant]]\n (clojure.lang.Agent w r))",
   :name "Agent2"}
  {:forms [(All binder type)],
   :name "All",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1448",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/All",
   :doc "A polymorphic binder",
   :var-type "type alias",
   :line 1448,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms [Any],
   :name "Any",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1308",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Any",
   :doc "Any is the top type that contains all types.",
   :var-type "type alias",
   :line 1308,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/AnyInteger",
   :namespace "clojure.core.typed",
   :forms [AnyInteger],
   :var-type "type alias",
   :doc
   "A type that returns true for clojure.core/integer?\n\n(U Integer Long clojure.lang.BigInt BigInteger Short Byte)",
   :name "AnyInteger"}
  {:forms [AnyValue],
   :name "AnyValue",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1313",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/AnyValue",
   :doc "AnyValue contains all Value singleton types",
   :var-type "type alias",
   :line 1313,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms [(Assoc type type-pairs*)],
   :name "Assoc",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1427",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Assoc",
   :doc "A type representing an assoc operation",
   :var-type "type alias",
   :line 1427,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Atom1",
   :namespace "clojure.core.typed",
   :forms [(Atom1 t)],
   :var-type "type alias",
   :doc
   "An atom that can read and write type x.\n\n(TFn [[x :variance :invariant]] (clojure.lang.Atom x x))",
   :name "Atom1"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Atom2",
   :namespace "clojure.core.typed",
   :forms [(Atom2 t)],
   :var-type "type alias",
   :doc
   "An atom that can write type w and read type r.\n\n(TFn\n [[w :variance :contravariant] [r :variance :covariant]]\n (clojure.lang.Atom w r))",
   :name "Atom2"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/BlockingDeref",
   :namespace "clojure.core.typed",
   :forms [(BlockingDeref t)],
   :var-type "type alias",
   :doc
   "A Clojure blocking derefable (see clojure.core/deref).\n\n(TFn [[x :variance :covariant]] (clojure.lang.IBlockingDeref x))",
   :name "BlockingDeref"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Bool",
   :namespace "clojure.core.typed",
   :forms [Bool],
   :var-type "type alias",
   :doc "A boolean\n\njava.lang.Boolean",
   :name "Bool"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Coll",
   :namespace "clojure.core.typed",
   :forms [(Coll t)],
   :var-type "type alias",
   :doc
   "A persistent collection with member type x.\n\n(TFn [[x :variance :covariant]] (clojure.lang.IPersistentCollection x))",
   :name "Coll"}
  {:forms [(CountRange Integer) (CountRange Integer Integer)],
   :name "CountRange",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1346",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/CountRange",
   :doc "A type representing a range of counts for a collection",
   :var-type "type alias",
   :line 1346,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Delay",
   :namespace "clojure.core.typed",
   :forms [(Delay t)],
   :var-type "type alias",
   :doc
   "A Clojure delay (see clojure.core/{delay,force}).\n\n(TFn [[x :variance :covariant]] (clojure.lang.Delay x))",
   :name "Delay"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Deref",
   :namespace "clojure.core.typed",
   :forms [(Deref t)],
   :var-type "type alias",
   :doc
   "A Clojure derefable (see clojure.core/deref).\n\n(TFn [[x :variance :covariant]] (clojure.lang.IDeref x))",
   :name "Deref"}
  {:forms [(Difference type type type*)],
   :name "Difference",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1357",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Difference",
   :doc
   "Difference represents a difference of types.\n\n(Difference t s) is the same as type t with type s removed.\n\neg. (Difference (U Int Long) Int) => Long\n    (Difference (U Num nil) nil)  => Num\n",
   :var-type "type alias",
   :line 1357,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms [(Dissoc type type*)],
   :name "Dissoc",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1432",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Dissoc",
   :doc "A type representing a dissoc operation",
   :var-type "type alias",
   :line 1432,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/EmptyCount",
   :namespace "clojure.core.typed",
   :forms [EmptyCount],
   :var-type "type alias",
   :doc
   "The type of all things with count 0. Use as part of an intersection.\neg. See EmptySeqable.\n\n(ExactCount 0)",
   :name "EmptyCount"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/EmptySeqable",
   :namespace "clojure.core.typed",
   :forms [(EmptySeqable t)],
   :var-type "type alias",
   :doc
   "A type that can be used to create a sequence of member type x\nwith count 0.\n\n(TFn\n [[x :variance :covariant]]\n (I (clojure.lang.Seqable x) (ExactCount 0)))",
   :name "EmptySeqable"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ExInfo",
   :namespace "clojure.core.typed",
   :forms [ExInfo],
   :var-type "type alias",
   :doc
   "A Clojure custom exception type.\n\n(I clojure.lang.IExceptionInfo RuntimeException)",
   :name "ExInfo"}
  {:forms [(ExactCount Integer)],
   :name "ExactCount",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1352",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ExactCount",
   :doc "A type representing a precise count for a collection",
   :var-type "type alias",
   :line 1352,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Fn",
   :namespace "clojure.core.typed",
   :forms [Fn],
   :var-type "type alias",
   :doc
   "A type that returns true for clojure.core/fn?\n\nclojure.lang.Fn",
   :name "Fn"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Future",
   :namespace "clojure.core.typed",
   :forms [(Future t)],
   :var-type "type alias",
   :doc
   "A Clojure future (see clojure.core/{future-call,future}).\n\n(TFn\n [[x :variance :covariant]]\n (Extends\n  [(clojure.lang.IDeref x)\n   (clojure.lang.IBlockingDeref x)\n   clojure.lang.IPending\n   java.util.concurrent.Future]))",
   :name "Future"}
  {:forms [(Get type type) (Get type type type)],
   :name "Get",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1437",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Get",
   :doc "A type representing a get operation",
   :var-type "type alias",
   :line 1437,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms
   [(HMap
     :mandatory
     {Constant Type*}
     :optional
     {Constant Type*}
     :absent-keys
     #{Constant*}
     :complete?
     Boolean)
    '{Constant Type*}],
   :name "HMap",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1380",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/HMap",
   :doc "HMap is a type for heterogeneous maps.",
   :var-type "type alias",
   :line 1380,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms
   [(HSeq [fixed*] :filter-sets [FS*] :objects [obj*])
    (HSeq [fixed* rest *] :filter-sets [FS*] :objects [obj*])
    (HSeq
     [fixed* drest ... bound]
     :filter-sets
     [FS*]
     :objects
     [obj*])],
   :name "HSeq",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1396",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/HSeq",
   :doc "HSeq is a type for heterogeneous seqs",
   :var-type "type alias",
   :line 1396,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms
   [(HSequential [fixed*] :filter-sets [FS*] :objects [obj*])
    (HSequential [fixed* rest *] :filter-sets [FS*] :objects [obj*])
    (HSequential
     [fixed* drest ... bound]
     :filter-sets
     [FS*]
     :objects
     [obj*])],
   :name "HSequential",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1389",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/HSequential",
   :doc
   "HSequential is a type for heterogeneous sequential collections",
   :var-type "type alias",
   :line 1389,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms [(HSet #{fixed*} :complete? Boolean)],
   :name "HSet",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1403",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/HSet",
   :doc
   "HSet is a type for heterogeneous sets.\nTakes a set of simple values. By default\n:complete? is true.\n\neg. (HSet #{:a :b :c} :complete? true)",
   :var-type "type alias",
   :line 1403,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms
   [(HVec [fixed*] :filter-sets [FS*] :objects [obj*])
    (HVec [fixed* type *] :filter-sets [FS*] :objects [obj*])
    (HVec [fixed* type ... bound] :filter-sets [FS*] :objects [obj*])
    '[fixed*]
    '[fixed* type *]
    '[fixed* type ... bound]],
   :name "HVec",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1368",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/HVec",
   :doc
   "HVec is a type for heterogeneous vectors.\nIt extends clojure.core.typed/Vec and is a subtype\nof clojure.core.typed/HSequential.",
   :var-type "type alias",
   :line 1368,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Hierarchy",
   :namespace "clojure.core.typed",
   :forms [Hierarchy],
   :var-type "type alias",
   :doc
   "A hierarchy for use with derive, isa? etc.\n\n'{:parents (clojure.lang.IPersistentMap Any Any),\n  :ancestors (clojure.lang.IPersistentMap Any Any),\n  :descendants (clojure.lang.IPersistentMap Any Any)}",
   :name "Hierarchy"}
  {:forms [(I type*)],
   :name "I",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1329",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/I",
   :doc "I represents an intersection of types",
   :var-type "type alias",
   :line 1329,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms
   [(IFn ArityVec+)
    [fixed*
     ->
     ret
     :filters
     {:then fl, :else fl}
     :object
     {:id Foo, :path Bar}]
    [fixed*
     rest
     *
     ->
     ret
     :filters
     {:then fl, :else fl}
     :object
     {:id Foo, :path Bar}]
    [fixed*
     drest
     ...
     bound
     ->
     ret
     :filters
     {:then fl, :else fl}
     :object
     {:id Foo, :path Bar}]],
   :name "IFn",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1412",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/IFn",
   :doc "An ordered intersection type of function arities.",
   :var-type "type alias",
   :line 1412,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Id",
   :namespace "clojure.core.typed",
   :forms [Id],
   :var-type "type alias",
   :doc
   "The identity function at the type level.\n\n(TFn [[x :variance :covariant]] x)",
   :name "Id"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Int",
   :namespace "clojure.core.typed",
   :forms [Int],
   :var-type "type alias",
   :doc
   "A type that returns true for clojure.core/integer?\n\n(U Integer Long clojure.lang.BigInt BigInteger Short Byte)",
   :name "Int"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Keyword",
   :namespace "clojure.core.typed",
   :forms [Keyword],
   :var-type "type alias",
   :doc "A keyword\n\nclojure.lang.Keyword",
   :name "Keyword"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Kw",
   :namespace "clojure.core.typed",
   :forms [Kw],
   :var-type "type alias",
   :doc "A keyword\n\nclojure.lang.Keyword",
   :name "Kw"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/List",
   :namespace "clojure.core.typed",
   :forms [(List t)],
   :var-type "type alias",
   :doc
   "A Clojure persistent list.\n\n(TFn [[x :variance :covariant]] (clojure.lang.IPersistentList x))",
   :name "List"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Map",
   :namespace "clojure.core.typed",
   :forms [(Map t t)],
   :var-type "type alias",
   :doc
   "A persistent map with keys k and vals v.\n\n(TFn\n [[k :variance :covariant] [v :variance :covariant]]\n (clojure.lang.IPersistentMap k v))",
   :name "Map"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Multi",
   :namespace "clojure.core.typed",
   :forms [Multi],
   :var-type "type alias",
   :doc "A Clojure multimethod.\n\nclojure.lang.MultiFn",
   :name "Multi"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Namespace",
   :namespace "clojure.core.typed",
   :forms [Namespace],
   :var-type "type alias",
   :doc "A namespace\n\nclojure.lang.Namespace",
   :name "Namespace"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Nilable",
   :namespace "clojure.core.typed",
   :forms [(Nilable t)],
   :var-type "type alias",
   :doc
   "A union of x and nil.\n\n(TFn [[x :variance :covariant]] (U nil x))",
   :name "Nilable"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NilableNonEmptyASeq",
   :namespace "clojure.core.typed",
   :forms [(NilableNonEmptyASeq t)],
   :var-type "type alias",
   :doc
   "The result of clojure.core/seq.\n\n(TFn\n [[x :variance :covariant]]\n (U\n  nil\n  (I\n   (clojure.lang.ISeq x)\n   clojure.lang.Sequential\n   (Iterable x)\n   (java.util.Collection x)\n   (java.util.List x)\n   clojure.lang.IObj\n   (CountRange 1))))",
   :name "NilableNonEmptyASeq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NilableNonEmptySeq",
   :namespace "clojure.core.typed",
   :forms [(NilableNonEmptySeq t)],
   :var-type "type alias",
   :doc
   "A persistent sequence of member type x with count greater than 0, or nil.\n\n(TFn\n [[x :variance :covariant]]\n (U nil (I (clojure.lang.ISeq x) (CountRange 1))))",
   :name "NilableNonEmptySeq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptyASeq",
   :namespace "clojure.core.typed",
   :forms [(NonEmptyASeq t)],
   :var-type "type alias",
   :doc
   "A sequential non-empty seq retured from clojure.core/seq\n\n(TFn\n [[x :variance :covariant]]\n (I\n  (clojure.lang.ISeq x)\n  clojure.lang.Sequential\n  (Iterable x)\n  (java.util.Collection x)\n  (java.util.List x)\n  clojure.lang.IObj\n  (CountRange 1)))",
   :name "NonEmptyASeq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptyAVec",
   :namespace "clojure.core.typed",
   :forms [(NonEmptyAVec t)],
   :var-type "type alias",
   :doc
   "A persistent vector returned from clojure.core/vector (and others) and count greater than 0.\n\n(TFn\n [[x :variance :covariant]]\n (I\n  (clojure.lang.IPersistentVector x)\n  (java.lang.Iterable x)\n  (java.util.Collection x)\n  (java.util.List x)\n  clojure.lang.IObj\n  (CountRange 1)))",
   :name "NonEmptyAVec"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptyColl",
   :namespace "clojure.core.typed",
   :forms [(NonEmptyColl t)],
   :var-type "type alias",
   :doc
   "A persistent collection with member type x and count greater than 0.\n\n(TFn\n [[x :variance :covariant]]\n (I (clojure.lang.IPersistentCollection x) (CountRange 1)))",
   :name "NonEmptyColl"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptyCount",
   :namespace "clojure.core.typed",
   :forms [NonEmptyCount],
   :var-type "type alias",
   :doc
   "The type of all things with count greater than 0. Use as part of an intersection.\neg. See NonEmptySeq\n\n(CountRange 1)",
   :name "NonEmptyCount"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptyLazySeq",
   :namespace "clojure.core.typed",
   :forms [(NonEmptyLazySeq t)],
   :var-type "type alias",
   :doc
   "A non-empty lazy sequence of type t\n\n(TFn\n [[t :variance :covariant]]\n (I (clojure.lang.LazySeq t) (CountRange 1)))",
   :name "NonEmptyLazySeq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptySeq",
   :namespace "clojure.core.typed",
   :forms [(NonEmptySeq t)],
   :var-type "type alias",
   :doc
   "A persistent sequence of member type x with count greater than 0.\n\n(TFn\n [[x :variance :covariant]]\n (I (clojure.lang.ISeq x) (CountRange 1)))",
   :name "NonEmptySeq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptySeqable",
   :namespace "clojure.core.typed",
   :forms [(NonEmptySeqable t)],
   :var-type "type alias",
   :doc
   "A type that can be used to create a sequence of member type x\nwith count greater than 0.\n\n(TFn\n [[x :variance :covariant]]\n (I (clojure.lang.Seqable x) (CountRange 1)))",
   :name "NonEmptySeqable"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptyVec",
   :namespace "clojure.core.typed",
   :forms [(NonEmptyVec t)],
   :var-type "type alias",
   :doc
   "A persistent vector with member type x and count greater than 0.\n\n(TFn\n [[x :variance :covariant]]\n (I (clojure.lang.IPersistentVector x) (CountRange 1)))",
   :name "NonEmptyVec"}
  {:forms [Nothing],
   :name "Nothing",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1323",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Nothing",
   :doc
   "Nothing is the bottom type that inhabits no types\nexcept itself.",
   :var-type "type alias",
   :line 1323,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Num",
   :namespace "clojure.core.typed",
   :forms [Num],
   :var-type "type alias",
   :doc "A type that returns true for clojure.core/number?\n\nNumber",
   :name "Num"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Option",
   :namespace "clojure.core.typed",
   :forms [(Option t)],
   :var-type "type alias",
   :doc
   "A union of x and nil.\n\n(TFn [[x :variance :covariant]] (U nil x))",
   :name "Option"}
  {:forms [(Pred type)],
   :name "Pred",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1420",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Pred",
   :doc
   "A predicate for the given type.\n\neg. Type for integer?: (Pred Int)",
   :var-type "type alias",
   :line 1420,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Promise",
   :namespace "clojure.core.typed",
   :forms [(Promise t)],
   :var-type "type alias",
   :doc
   "A Clojure promise (see clojure.core/{promise,deliver}).\n\n(TFn\n [[x :variance :invariant]]\n (Rec\n  [p]\n  (I\n   (Extends\n    [(clojure.lang.IDeref x)\n     (clojure.lang.IBlockingDeref x)\n     clojure.lang.IPending])\n   [x -> (U nil p)])))",
   :name "Promise"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Proxy",
   :namespace "clojure.core.typed",
   :forms [Proxy],
   :var-type "type alias",
   :doc "A Clojure proxy.\n\nclojure.lang.IProxy",
   :name "Proxy"}
  {:forms [(Rec binder type)],
   :name "Rec",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1443",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Rec",
   :doc "A recursive type",
   :var-type "type alias",
   :line 1443,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Ref1",
   :namespace "clojure.core.typed",
   :forms [(Ref1 t)],
   :var-type "type alias",
   :doc
   "A ref that can read and write type x.\n\n(TFn [[x :variance :invariant]] (clojure.lang.Ref x x))",
   :name "Ref1"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Ref2",
   :namespace "clojure.core.typed",
   :forms [(Ref2 w r)],
   :var-type "type alias",
   :doc
   "A ref that can write type w and read type r.\n\n(TFn\n [[w :variance :contravariant] [r :variance :covariant]]\n (clojure.lang.Ref w r))",
   :name "Ref2"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Reversible",
   :namespace "clojure.core.typed",
   :forms [(Reversible t)],
   :var-type "type alias",
   :doc
   "A Clojure reversible collection.\n\n(TFn [[x :variance :covariant]] (clojure.lang.Reversible x))",
   :name "Reversible"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Seq",
   :namespace "clojure.core.typed",
   :forms [(Seq t)],
   :var-type "type alias",
   :doc
   "A persistent sequence of member type x.\n\n(TFn [[x :variance :covariant]] (clojure.lang.ISeq x))",
   :name "Seq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Seqable",
   :namespace "clojure.core.typed",
   :forms [(Seqable t)],
   :var-type "type alias",
   :doc
   "A type that can be used to create a sequence of member type x.\n\n(TFn [[x :variance :covariant]] (clojure.lang.Seqable x))",
   :name "Seqable"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Sequential",
   :namespace "clojure.core.typed",
   :forms [Sequential],
   :var-type "type alias",
   :doc "A sequential collection.\n\nclojure.lang.Sequential",
   :name "Sequential"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/SequentialSeq",
   :namespace "clojure.core.typed",
   :forms [(SequentialSeq t)],
   :var-type "type alias",
   :doc
   "A Clojure sequential sequence. Seq's aren't always Sequential.\n\n(TFn\n [[x :variance :covariant]]\n (I clojure.lang.Sequential (clojure.lang.ISeq x)))",
   :name "SequentialSeq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/SequentialSeqable",
   :namespace "clojure.core.typed",
   :forms [(SequentialSeqable t)],
   :var-type "type alias",
   :doc
   "A sequential, seqable collection. Seq's aren't always Sequential.\n\n(TFn\n [[x :variance :covariant]]\n (I clojure.lang.Sequential (clojure.lang.Seqable x)))",
   :name "SequentialSeqable"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Set",
   :namespace "clojure.core.typed",
   :forms [(Set t)],
   :var-type "type alias",
   :doc
   "A persistent set with member type x\n\n(TFn [[x :variance :covariant]] (clojure.lang.IPersistentSet x))",
   :name "Set"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/SortedSet",
   :namespace "clojure.core.typed",
   :forms [(SortedSet t)],
   :var-type "type alias",
   :doc
   "A sorted persistent set with member type x\n\n(TFn\n [[x :variance :covariant]]\n (Extends [(clojure.lang.IPersistentSet x) clojure.lang.Sorted]))",
   :name "SortedSet"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Stack",
   :namespace "clojure.core.typed",
   :forms [(Stack t)],
   :var-type "type alias",
   :doc
   "A Clojure stack.\n\n(TFn [[x :variance :covariant]] (clojure.lang.IPersistentStack x))",
   :name "Stack"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Str",
   :namespace "clojure.core.typed",
   :forms [Str],
   :var-type "type alias",
   :doc "A string\n\njava.lang.String",
   :name "Str"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Sym",
   :namespace "clojure.core.typed",
   :forms [Sym],
   :var-type "type alias",
   :doc "A symbol\n\nclojure.lang.Symbol",
   :name "Sym"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Symbol",
   :namespace "clojure.core.typed",
   :forms [Symbol],
   :var-type "type alias",
   :doc "A symbol\n\nclojure.lang.Symbol",
   :name "Symbol"}
  {:forms [(TFn binder type)],
   :name "TFn",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1453",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/TFn",
   :doc "A type function",
   :var-type "type alias",
   :line 1453,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms [(U type*)],
   :name "U",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1318",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/U",
   :doc "U represents a union of types",
   :var-type "type alias",
   :line 1318,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms [(Val Constant) 'Constant],
   :name "Val",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1334",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Val",
   :doc "A singleton type for a constant value.",
   :var-type "type alias",
   :line 1334,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:forms [(Value Constant) 'Constant],
   :name "Value",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1340",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Value",
   :doc "A singleton type for a constant value.",
   :var-type "type alias",
   :line 1340,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Var1",
   :namespace "clojure.core.typed",
   :forms [(Var1 t)],
   :var-type "type alias",
   :doc
   "An var that can read and write type x.\n\n(TFn [[x :variance :invariant]] (clojure.lang.Var x x))",
   :name "Var1"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Var2",
   :namespace "clojure.core.typed",
   :forms [(Var2 w r)],
   :var-type "type alias",
   :doc
   "An var that can write type w and read type r.\n\n(TFn\n [[w :variance :contravariant] [r :variance :covariant]]\n (clojure.lang.Var w r))",
   :name "Var2"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Vec",
   :namespace "clojure.core.typed",
   :forms [(Vec t)],
   :var-type "type alias",
   :doc
   "A persistent vector with member type x.\n\n(TFn [[x :variance :covariant]] (clojure.lang.IPersistentVector x))",
   :name "Vec"}
  {:arglists ([varsym typesyn]),
   :name "ann",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1679",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann",
   :doc
   "Annotate varsym with type. If unqualified, qualify in the current namespace.\nIf varsym has metadata {:no-check true}, ignore definitions of varsym \nwhile type checking.\n\nIf annotating vars in namespaces other than the current one, a fully\nqualified symbol must be provided. Note that namespace aliases are not\nrecognised: the *full* namespace must be given in the first part of the symbol.\n\neg. ; annotate the var foo in this namespace\n    (ann foo [Number -> Number])\n\n    ; annotate a var in another namespace\n    (ann another.ns/bar [-> nil])\n \n    ; don't check this var\n    (ann ^:no-check foobar [Integer -> String])",
   :var-type "macro",
   :line 1679,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& args]),
   :forms
   [(ann-datatype dname [field :- type*] opts*)
    (ann-datatype binder dname [field :- type*] opts*)],
   :name "ann-datatype",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1734",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-datatype",
   :doc
   "Annotate datatype Class name dname with expected fields.\nIf unqualified, qualify in the current namespace.\nTakes an optional type variable binder before the name.\n\nFields must be specified in the same order as presented \nin deftype, with exactly the same field names.\n\nAlso annotates datatype factories and constructors.\n\nBinder is a vector of specs. Each spec is a vector\nwith the variable name as the first entry, followed by\nkeyword arguments:\n- :variance (mandatory)\n  The declared variance of the type variable. Possible\n  values are :covariant, :contravariant and :invariant.\n- :< (optional)\n  The upper type bound of the type variable. Defaults to\n  Any, or the most general type of the same rank as the\n  lower bound.\n- :> (optional)\n  The lower type bound of the type variable. Defaults to\n  Nothing, or the least general type of the same rank as the\n  upper bound.\n\neg. ; a datatype in the current namespace\n    (ann-datatype MyDatatype [a :- Number,\n                              b :- Long])\n\n    ; a datatype in another namespace\n    (ann-datatype another.ns.TheirDatatype\n                  [str :- String,\n                   vec :- (Vec Number)])\n\n    ; a datatype, polymorphic in a\n    (ann-datatype [[a :variance :covariant]]\n                  MyPolyDatatype\n                  [str :- String,\n                   vec :- (Vec Number)\n                   ply :- (Set a)])",
   :var-type "macro",
   :line 1734,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([form ty]),
   :name "ann-form",
   :namespace "clojure.core.typed",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-form",
   :doc "Annotate a form with an expected type.",
   :var-type "macro",
   :line 123,
   :file "module-check/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([& args]),
   :forms
   [(ann-interface vbnd varsym & methods)
    (ann-interface varsym & methods)],
   :name "ann-interface",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1966",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-interface",
   :doc
   "Annotate a possibly polymorphic interface (created with definterface) with method types.\n\nNote: Unlike ann-protocol, omit the target ('this') argument in the method signatures.\n\neg. (ann-interface IFoo\n      bar\n      (Fn [-> Any]\n          [Number Symbol -> Any])\n      baz\n      [Number -> Number])\n    (definterface IFoo\n      (bar [] [n s])\n      (baz [n]))\n\n    ; polymorphic protocol\n    ; x is scoped in the methods\n    (ann-protocol [[x :variance :covariant]]\n      IFooPoly\n      bar\n      (Fn [-> Any]\n          [Number Symbol -> Any])\n      baz\n      [Number -> Number])\n    (definterface IFooPoly\n      (bar [] [n s])\n      (baz [n]))",
   :var-type "macro",
   :line 1966,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([t & vs]),
   :name "ann-many",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1720",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-many",
   :doc
   "Annotate several vars with type t.\n\neg. (ann-many FakeSearch\n              web1 web2 image1 image2 video1 video2)",
   :var-type "macro",
   :line 1720,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists
   ([dname
     vbnd
     fields
     &
     {ancests :unchecked-ancestors, rplc :replace, :as opt}]),
   :name "ann-precord",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1893",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-precord",
   :doc
   "Annotate record Class name dname with a polymorphic binder and expected fields.\nIf unqualified, qualify in the current namespace.",
   :var-type "macro",
   :line 1893,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& args]),
   :forms
   [(ann-protocol vbnd varsym & methods)
    (ann-protocol varsym & methods)],
   :name "ann-protocol",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1907",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-protocol",
   :doc
   "Annotate a possibly polymorphic protocol var with method types.\n\neg. (ann-protocol IFoo\n      bar\n      (Fn [IFoo -> Any]\n          [IFoo Number Symbol -> Any])\n      baz\n      [IFoo Number -> Number])\n    (defprotocol> IFoo\n      (bar [this] [this n s])\n      (baz [this n]))\n\n    ; polymorphic protocol\n    ; x is scoped in the methods\n    (ann-protocol [[x :variance :covariant]]\n      IFooPoly\n      bar\n      (Fn [(IFooPoly x) -> Any]\n          [(IFooPoly x) Number Symbol -> Any])\n      baz\n      [(IFooPoly x) Number -> Number])\n    (defprotocol> IFooPoly\n      (bar [this] [this n s])\n      (baz [this n]))",
   :var-type "macro",
   :line 1907,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& args]),
   :forms
   [(ann-record dname [field :- type*] opts*)
    (ann-record binder dname [field :- type*] opts*)],
   :name "ann-record",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1822",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-record",
   :doc
   "Annotate record Class name dname with expected fields.\nIf unqualified, qualify in the current namespace.\nTakes an optional type variable binder before the name.\n\nFields must be specified in the same order as presented \nin defrecord, with exactly the same field names.\n\nAlso annotates record factories and constructors.\n\nBinder is a vector of specs. Each spec is a vector\nwith the variable name as the first entry, followed by\nkeyword arguments:\n- :variance (mandatory)\n  The declared variance of the type variable. Possible\n  values are :covariant, :contravariant and :invariant.\n- :< (optional)\n  The upper type bound of the type variable. Defaults to\n  Any, or the most general type of the same rank as the\n  lower bound.\n- :> (optional)\n  The lower type bound of the type variable. Defaults to\n  Nothing, or the least general type of the same rank as the\n  upper bound.\n\neg. ; a record in the current namespace\n    (ann-record MyRecord [a :- Number,\n                          b :- Long])\n\n    ; a record in another namespace\n    (ann-record another.ns.TheirRecord\n                  [str :- String,\n                   vec :- (Vec Number)])\n\n    ; a record, polymorphic in a\n    (ann-record [[a :variance :covariant]]\n                MyPolyRecord\n                [str :- String,\n                 vec :- (Vec Number)\n                 ply :- (Set a)])",
   :var-type "macro",
   :line 1822,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& args]),
   :name "atom",
   :namespace "clojure.core.typed",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/atom",
   :doc
   "Like atom, but with optional type annotations.\n\nSame as (atom (ann-form init t) args*)\n\neg. (atom 1) : (Atom1 (Value 1))\n    (atom :- Num, 1) : (Atom1 Num)",
   :var-type "macro",
   :line 199,
   :file "module-check/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([t init & args]),
   :name "atom>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1199",
   :deprecated "0.2.58",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/atom>",
   :doc
   "DEPRECATED: use clojure.core.typed/atom\n\nLike atom, but creates an Atom1 of type t.\n\nSame as (atom (ann-form init t) args*)\n\neg. (atom> Number 1)\n    (atom> (Vec Any) [])",
   :var-type "macro",
   :line 1199,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([form] [form expected]),
   :name "cf",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2146",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/cf",
   :doc
   "Takes a form and an optional expected type and\nreturns a human-readable inferred type for that form.\nThrows an exception if type checking fails.\n\nDo not use cf inside a typed namespace. cf is intended to be\nused at the REPL or within a unit test. Note that testing for\ntruthiness is not sufficient to unit test a call to cf, as nil\nand false are valid type syntax.\n\ncf preserves annotations from previous calls to check-ns or cf,\nand keeps any new ones collected during a cf. This is useful for\ndebugging and experimentation. cf may be less strict than check-ns\nwith type checker warnings.\n\neg. (cf 1) \n    ;=> Long\n\n    (cf #(inc %) [Number -> Number])\n    ;=> [Number -> Number]",
   :var-type "macro",
   :line 2146,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2134",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/check-form*",
   :namespace "clojure.core.typed",
   :line 2134,
   :var-type "var",
   :doc
   "Takes a (quoted) form and optional expected type syntax and\ntype checks the form. If expected is provided, type-provided?\nmust be true.",
   :name "check-form*"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2112",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/check-form-info",
   :namespace "clojure.core.typed",
   :line 2112,
   :var-type "var",
   :doc
   "Type checks a (quoted) form and returns a map of results from type checking the\nform.\n\nOptions\n- :expected        Type syntax representing the expected type for this form\n                   type-provided? option must be true to utilise the type.\n- :type-provided?  If true, use the expected type to check the form\n- :profile         Use Timbre to profile the type checker. Timbre must be\n                   added as a dependency.\n- :file-mapping    If true, return map provides entry :file-mapping, a hash-map\n                   of (Map '{:line Int :column Int :file Str} Str).\n- :checked-ast     Returns the entire AST for the given form as the :checked-ast entry,\n                   annotated with the static types inferred after checking.\n\nDefault return map\n- :delayed-errors  A sequence of delayed errors (ex-info instances)\n- :ret             TCResult inferred for the current form",
   :name "check-form-info"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2186",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/check-ns",
   :namespace "clojure.core.typed",
   :line 2186,
   :var-type "var",
   :doc
   "Type check a namespace/s (a symbol or Namespace, or collection).\nIf not provided default to current namespace.\nReturns a true value if type checking is successful, otherwise\nthrows an Exception.\n\nDo not use check-ns within a checked namespace.\nIt is intended to be used at the REPL or within a unit test.\nSuggested idiom for clojure.test: (is (check-ns 'your.ns))\n\ncheck-ns resets annotations collected from \nprevious check-ns calls or cf. A successful check-ns call will\npreserve any type annotations collect during that checking run.\n\nKeyword arguments:\n- :collect-only  if true, collect type annotations but don't type check code.\n                 Useful for debugging purposes.\n- :trace         if true, print some basic tracing of the type checker\n- :profile       if true, use Timbre to profile type checking. Must include\n                 Timbre as a dependency.\n\nIf providing keyword arguments, the namespace to check must be provided\nas the first argument.\n\nBind clojure.core.typed.util-vars/*verbose-types* to true to print fully qualified types.\nBind clojure.core.typed.util-vars/*verbose-forms* to print full forms in error messages.\n\neg. (check-ns 'myns.typed)\n    ;=> :ok\n   \n    ; implicitly check current namespace\n    (check-ns)\n    ;=> :ok\n\n    ; collect but don't check the current namespace\n    (check-ns *ns* :collect-only true)",
   :name "check-ns"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2169",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/check-ns-info",
   :namespace "clojure.core.typed",
   :line 2169,
   :var-type "var",
   :doc
   "Same as check-ns, but returns a map of results from type checking the\nnamespace.\n\nOptions\n- :collect-only    Don't type check the given namespace/s, but collect the \n                   top level type annotations like ann, ann-record.\n- :type-provided?  If true, use the expected type to check the form\n- :profile         Use Timbre to profile the type checker. Timbre must be\n                   added as a dependency.\n- :file-mapping    If true, return map provides entry :file-mapping, a hash-map\n                   of (Map '{:line Int :column Int :file Str} Str).",
   :name "check-ns-info"}
  {:arglists ([sym ty]),
   :name "declare-alias-kind",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1163",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/declare-alias-kind",
   :doc
   "Declare a kind for an alias, similar to declare but on the kind level.",
   :var-type "macro",
   :line 1163,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& syms]),
   :name "declare-datatypes",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1141",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/declare-datatypes",
   :doc "Declare datatypes, similar to declare but on the type level.",
   :var-type "macro",
   :line 1141,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& syms]),
   :name "declare-names",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1176",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/declare-names",
   :doc "Declare names, similar to declare but on the type level.",
   :var-type "macro",
   :line 1176,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& syms]),
   :name "declare-protocols",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1152",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/declare-protocols",
   :doc "Declare protocols, similar to declare but on the type level.",
   :var-type "macro",
   :line 1152,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([name & fdecl]),
   :forms [(def name docstring? :- type? expr)],
   :name "def",
   :namespace "clojure.core.typed",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/def",
   :doc
   "Like clojure.core/def with optional type annotations\n\nNB: in Clojure it is impossible to refer a var called `def` as it is a\nspecial form. Use an alias prefix (eg. `t/def`).\n\nIf an annotation is provided, a corresponding `ann` form\nis generated, otherwise it expands identically to clojure.core/def\n\neg. ;same as clojure.core/def\n    (def vname 1)\n    \n    ;with Number `ann`\n    (def vname :- Number 1)\n\n    ;doc\n    (def vname\n      \"Docstring\"\n      :- Long\n      1)",
   :var-type "macro",
   :line 22,
   :file "module-check/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([sym doc-str t] [sym t]),
   :name "def-alias",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1235",
   :deprecated "0.2.45",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/def-alias",
   :doc
   "DEPRECATED: use defalias\n\nDefine a type alias. Takes an optional doc-string as a second\nargument.\n\nUpdates the corresponding var with documentation.\n\neg. (def-alias MyAlias\n      \"Here is my alias\"\n      (U nil String))",
   :var-type "macro",
   :line 1235,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([name & fdecl]),
   :forms [(def> name docstring? :- type expr)],
   :name "def>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L763",
   :deprecated "0.2.45",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/def>",
   :doc
   "DEPRECATED: use clojure.core.typed/def\n\nLike def, but with annotations.\n\neg. (def> vname :- Long 1)\n\n;doc\n(def> vname\n  \"Docstring\"\n  :- Long\n  1)",
   :var-type "macro",
   :line 763,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([sym doc-str t] [sym t]),
   :name "defalias",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1268",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/defalias",
   :doc
   "Define a type alias. Takes an optional doc-string as a second\nargument.\n\nUpdates the corresponding var with documentation.\n\neg. (defalias MyAlias\n      \"Here is my alias\"\n      (U nil String))",
   :var-type "macro",
   :line 1268,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& args]),
   :forms
   [(defn poly? name docstring? [param :- type *] :- type exprs*)
    (defn poly? name docstring? ([param :- type *] :- type exprs*) +)],
   :name "defn",
   :namespace "clojure.core.typed",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/defn",
   :doc
   "Like defn, but with optional annotations. All annotations default to Any,\nlike the typed fn macro. Rest parameters default to starred.\n\neg. (defn fname [a :- Number, b :- (U Symbol nil)] :- Integer ...)\n\n;annotate return\n(defn fname [a :- String] :- String ...)\n\n;multi-arity\n(defn fname \n  ([a :- String] :- String ...)\n  ([a :- String, b :- Number] :- Long ...))",
   :var-type "macro",
   :line 229,
   :file "module-check/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([name & fdecl]),
   :forms
   [(defn> name docstring? :- type [param :- type *] exprs*)
    (defn> name docstring? (:- type [param :- type *] exprs*) +)],
   :name "defn>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L730",
   :deprecated "0.2.57",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/defn>",
   :doc
   "DEPRECATED: Use defn\n\nLike defn, but with annotations. Annotations are mandatory for\nparameters and for return type.\n\neg. (defn> fname :- Integer [a :- Number, b :- (U Symbol nil)] ...)\n\n;annotate return\n(defn> fname :- String [a :- String] ...)\n\n;multi-arity\n(defn> fname \n  (:- String [a :- String] ...)\n  (:- Long   [a :- String, b :- Number] ...))",
   :var-type "macro",
   :line 730,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& body]),
   :name "defprotocol",
   :namespace "clojure.core.typed",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/defprotocol",
   :doc
   "Like defprotocol, but with optional type annotations.\n\nOmitted annotations default to Any, except for the first\nparameter of a method which defaults to the current protocol\nbeing annotated (instantiated with any variables it has).\n\nAdd a binder before the protocol name to define a polymorphic\nprotocol. A binder before the method name defines a polymorphic\nmethod, however a method binder must not shadow type variables\nintroduced by a protocol binder.\n\nReturn types for each method arity can be annotated.\n\nUnlike clojure.core/defprotocol, successive methods can\nhave the same arity. Semantically, providing multiple successive\nmethods of the same arity is the same as just providing the left-most\nmethod. However the types for these methods will be accumulated into\na Fn type.\n\neg. ;annotate single method\n(defprotocol MyProtocol\n  (a [this a :- Integer] :- Number))\n\n;polymorphic protocol\n(defprotocol [[x :variance :covariant]]\n  MyProtocol\n  (a [this a :- Integer] :- Number))\n\n;multiple types for the same method\n(defprotocol [[x :variance :covariant]]\n  MyProtocol\n  (a [this a :- Integer] :- Integer\n     [this a :- Long] :- Long\n     [this a :- Number] :- Number))\n\n;polymorphic method+protocol\n(defprotocol [[x :variance :covariant]]\n  MyProtocol\n  ([y] a [this a :- x, b :- y] :- y))\n",
   :var-type "macro",
   :line 133,
   :file "module-check/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([& body]),
   :name "defprotocol>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1067",
   :deprecated "0.2.45",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/defprotocol>",
   :doc
   "DEPRECATED: use clojure.core.typed/defprotocol\n\nLike defprotocol, but required for type checking\nits macroexpansion.\n\neg. (defprotocol> MyProtocol\n      (a [this]))",
   :var-type "macro",
   :line 1067,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([seq-exprs & body]),
   :name "doseq",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L571",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/doseq",
   :doc
   "Like clojure.core/doseq with optional annotations.\n\n:let option uses clojure.core.typed/let\n\neg.\n(doseq [a :- (U nil AnyInteger) [1 nil 2 3]\n        :when a]\n   (inc a))",
   :var-type "macro",
   :line 571,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([seq-exprs & body]),
   :name "doseq>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L466",
   :deprecated "0.2.45",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/doseq>",
   :doc
   "DEPRECATED: use clojure.core.typed/doseq\n\nLike doseq but requires annotation for each loop variable: \n[a [1 2]] becomes [a :- Long [1 2]]\n\neg.\n(doseq> [a :- (U nil AnyInteger) [1 nil 2 3]\n         :when a]\n   (inc a))",
   :var-type "macro",
   :line 466,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([bindings & body]),
   :name "dotimes",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L170",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/dotimes",
   :doc
   "Like clojure.core/dotimes, but with optional annotations.\n\nIf annotation for binding is omitted, defaults to Int.\n\neg. (dotimes [_ 100]\n      (println \"like normal\"))\n\n    (dotimes [x :- Num, 100.123]\n      (println \"like normal\" x))",
   :var-type "macro",
   :line 170,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([bindings & body]),
   :name "dotimes>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L147",
   :deprecated "0.2.45",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/dotimes>",
   :doc
   "DEPRECATED: Use clojure.core.typed/dotimes\n\nLike dotimes.\n\neg. (dotimes> [_ 100]\n      (println \"like normal\"))",
   :var-type "macro",
   :line 147,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2246",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/envs",
   :namespace "clojure.core.typed",
   :line 2246,
   :var-type "var",
   :doc
   "Returns a map of type environments, according to the current state of the\ntype checker.\n\nOutput map:\n- :vars      map from var symbols to their verbosely printed types\n- :aliases   map from alias var symbols (made with defalias) to their verbosely printed types\n- :special-types  a set of Vars that are special to the type checker (like Any, U, I)\n",
   :name "envs"}
  {:arglists ([& forms]),
   :forms
   [(fn name? [param :- type* & param :- type * ?] :- type? exprs*)
    (fn
     name?
     ([param :- type* & param :- type * ?] :- type? exprs*)
     +)],
   :name "fn",
   :namespace "clojure.core.typed",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/fn",
   :doc
   "Like clojure.core/fn, but with optional annotations.\n\neg. ;these forms are equivalent\n    (fn [a] b)\n    (fn [a :- Any] b)\n    (fn [a :- Any] :- Any b)\n    (fn [a] :- Any b)\n\n    ;annotate return\n    (fn [a :- String] :- String body)\n\n    ;named fn\n    (fn fname [a :- String] :- String body)\n\n    ;rest parameter\n    (fn [a :- String & b :- Number *] body)\n\n    ;dotted rest parameter\n    (fn [a :- String & b :- Number ... x] body)\n\n    ;multi-arity\n    (fn fname \n      ([a :- String] :- String ...)\n      ([a :- String, b :- Number] :- String ...))",
   :var-type "macro",
   :line 56,
   :file "module-check/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([& forms]),
   :forms
   [(fn> name? :- type? [param :- type* & param :- type * ?] exprs*)
    (fn>
     name?
     (:- type? [param :- type* & param :- type * ?] exprs*)
     +)],
   :name "fn>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L687",
   :deprecated "0.2.45",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/fn>",
   :doc
   "DEPRECATED: use clojure.core.typed/fn\n\nLike fn, but with annotations. Annotations are mandatory\nfor parameters, with optional annotations for return type.\nIf fn is named, return type annotation is mandatory.\n\nSuggested idiom: use commas between parameter annotation triples.\n\neg. (fn> [a :- Number, b :- (U Symbol nil)] ...)\n\n    ;annotate return\n    (fn> :- String [a :- String] ...)\n\n    ;named fn\n    (fn> fname :- String [a :- String] ...)\n\n    ;multi-arity\n    (fn> fname \n      (:- String [a :- String] ...)\n      (:- Long   [a :- String, b :- Number] ...))",
   :var-type "macro",
   :line 687,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([seq-exprs & maybe-ann-body-expr]),
   :name "for",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L325",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/for",
   :doc
   "Like clojure.core/for with optional type annotations.\n\nAll types default to Any.\n\nThe :let option uses clojure.core.typed/let.\n\neg. (for [a :- (U nil Int) [1 nil 2 3]\n          :when a]\n      :- Number\n      (inc a))",
   :var-type "macro",
   :line 325,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([tk ret-ann seq-exprs body-expr]),
   :name "for>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L192",
   :deprecated "0.2.45",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/for>",
   :doc
   "DEPRECATED: use clojure.core.typed/for\n\nLike for but requires annotation for each loop variable: [a [1 2]] becomes [a :- Long [1 2]]\nAlso requires annotation for return type.\n\neg. (for> :- Number\n      [a :- (U nil AnyInteger) [1 nil 2 3]\n       :when a]\n      (inc a))",
   :var-type "macro",
   :line 192,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([inst-of & types]),
   :name "inst",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L111",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/inst",
   :doc
   "Instantiate a polymorphic type with a number of types.\n\neg. (inst foo-fn t1 t2 t3 ...)",
   :var-type "macro",
   :line 111,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([inst-of & types]),
   :name "inst-ctor",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L119",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/inst-ctor",
   :doc
   "Instantiate a call to a constructor with a number of types.\nFirst argument must be an immediate call to a constructor.\nReturns exactly the instantiatee (the first argument).\n\neg. (inst-ctor (PolyCtor. a b c)\n               t1 t2 ...)",
   :var-type "macro",
   :line 119,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists
   ([cljt coll] [javat cljt coll] [into-array-syn javat cljt coll]),
   :name "into-array>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1614",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/into-array>",
   :doc
   "Make a Java array with Java class javat and Typed Clojure type\ncljt. Resulting array will be of type javat, but elements of coll must be under\ncljt. cljt should be a subtype of javat (the same or more specific).\n\n*Temporary hack*\ninto-array-syn is exactly the syntax to put as the first argument to into-array.\nCalling resolve on this syntax should give the correct class.",
   :var-type "macro",
   :line 1614,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([bvec & forms]),
   :forms [(let [binding :- type? init*] exprs*)],
   :name "let",
   :namespace "clojure.core.typed",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/let",
   :doc
   "Like clojure.core/let but supports optional type annotations.\n\neg. (let [a :- Type, b\n          a2 1.2]\n      body)",
   :var-type "macro",
   :line 111,
   :file "module-check/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([fn-specs-and-annotations & body]),
   :forms [(letfn> [fn-spec-or-annotation*] expr*)],
   :name "letfn>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L795",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/letfn>",
   :doc
   "Like letfn, but each function spec must be annotated.\n\neg. (letfn> [a :- [Number -> Number]\n             (a [b] 2)\n\n             c :- [Symbol -> nil]\n             (c [s] nil)]\n      ...)",
   :var-type "macro",
   :line 795,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L50",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/load-if-needed",
   :namespace "clojure.core.typed",
   :line 50,
   :var-type "var",
   :doc "Load and initialize all of core.typed if not already",
   :name "load-if-needed"}
  {:arglists ([bindings & exprs]),
   :forms [(loop [binding :- type? init*] exprs*)],
   :name "loop",
   :namespace "clojure.core.typed",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/loop",
   :doc
   "Like clojure.core/loop, and supports optional type annotations.\nArguments default to a generalised type based on the initial value.\n\neg. (loop [a :- Number 1\n           b :- (U nil Number) nil]\n      ...)",
   :var-type "macro",
   :line 93,
   :file "module-check/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([bndings* & forms]),
   :forms [(loop> [binding :- type init*] exprs*)],
   :name "loop>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1085",
   :deprecated "0.2.45",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/loop>",
   :doc
   "DEPRECATED: use clojure.core.typed/loop\n\nLike loop, except loop variables require annotation.\n\nSuggested idiom: use a comma between the type and the initial\nexpression.\n\neg. (loop> [a :- Number, 1\n            b :- (U nil Number), nil]\n      ...)",
   :var-type "macro",
   :line 1085,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L63",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/method-type",
   :namespace "clojure.core.typed",
   :line 63,
   :var-type "var",
   :doc
   "Given a method symbol, print the core.typed types assigned to it.\nIntended for use at the REPL.",
   :name "method-type"}
  {:arglists ([msym mmap]),
   :name "nilable-param",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1653",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/nilable-param",
   :doc
   "Override which parameters in qualified method msym may accept\nnilable values. If the parameter is a parameterised type or\nan Array, this also declares the parameterised types and the Array type as nilable.\n\nmmap is a map mapping arity parameter number to a set of parameter\npositions (integers). If the map contains the key :all then this overrides\nother entries. The key can also be :all, which declares all parameters nilable.",
   :var-type "macro",
   :line 1653,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([msym arities]),
   :name "non-nil-return",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1636",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/non-nil-return",
   :doc
   "Override the return type of fully qualified method msym to be non-nil.\nTakes a set of relevant arities,\nrepresented by the number of parameters it takes (rest parameter counts as one),\nor :all which overrides all arities.\n\neg. ; must use full class name\n    (non-nil-return java.lang.Class/getDeclaredMethod :all)",
   :var-type "macro",
   :line 1636,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([ctorsym typesyn]),
   :name "override-constructor",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2035",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/override-constructor",
   :doc "Override all constructors for Class ctorsym with type.",
   :var-type "macro",
   :line 2035,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([methodsym typesyn]),
   :name "override-method",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2046",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/override-method",
   :doc "Override type for qualified method methodsym.",
   :var-type "macro",
   :line 2046,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& forms]),
   :name "pfn>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L678",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/pfn>",
   :doc
   "Define a polymorphic typed anonymous function.\n(pfn> name? [binder+] :- type? [[param :- type]* & [param :- type *]?] exprs*)\n(pfn> name? [binder+] (:- type? [[param :- type]* & [param :- type *]?] exprs*)+)",
   :var-type "macro",
   :line 678,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([t]),
   :name "pred",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2267",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/pred",
   :doc
   "Generate a flat (runtime) predicate for type that returns true if the\nargument is a subtype of the type, otherwise false.\n\nThe current type variable and dotted type variable scope is cleared before parsing.\n\neg. ((pred Number) 1)\n    ;=> true",
   :var-type "macro",
   :line 2267,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1667",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/print-env",
   :namespace "clojure.core.typed",
   :line 1667,
   :var-type "var",
   :doc
   "During type checking, print the type environment to *out*,\npreceeded by literal string debug-str.",
   :name "print-env"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L88",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/print-filterset",
   :namespace "clojure.core.typed",
   :line 88,
   :var-type "var",
   :doc
   "During type checking, print the filter set attached to form, \npreceeded by literal string debug-string.\nReturns nil.\n\neg. (let [s (seq (get-a-seqable))]\n      (print-filterset \"Here now\" s))",
   :name "print-filterset"}
  {:arglists ([& args]),
   :name "ref",
   :namespace "clojure.core.typed",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ref",
   :doc
   "Like ref, but with optional type annotations.\n\nSame as (ref (ann-form init t) args*)\n\neg. (ref 1) : (Ref1 (Value 1))\n    (ref :- Num, 1) : (Ref1 Num)",
   :var-type "macro",
   :line 214,
   :file "module-check/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([t init & args]),
   :name "ref>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L1217",
   :deprecated "0.2.58",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ref>",
   :doc
   "DEPRECATED: use clojure.core.typed/ref\n\nLike ref, but creates a Ref1 of type t.\n\nSame as (ref (ann-form init t) args*)\n\neg. (ref> Number 1)\n    (ref> (Vec Any) [])",
   :var-type "macro",
   :line 1217,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L55",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/reset-caches",
   :namespace "clojure.core.typed",
   :line 55,
   :var-type "var",
   :doc "Reset internal type caches.",
   :name "reset-caches"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2229",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/statistics",
   :namespace "clojure.core.typed",
   :line 2229,
   :var-type "var",
   :doc
   "Takes a collection of namespace symbols and returns a map mapping the namespace\nsymbols to a map of data",
   :name "statistics"}
  {:arglists ([& body]),
   :name "tc-ignore",
   :namespace "clojure.core.typed",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/tc-ignore",
   :doc "Ignore forms in body during type checking",
   :var-type "macro",
   :line 180,
   :file "module-check/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([& args]),
   :name "typed-deps",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2057",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/typed-deps",
   :doc
   "Declare namespaces which should be checked before the current namespace.\nAccepts any number of symbols. Only has effect via check-ns.\n\neg. (typed-deps clojure.core.typed.holes\n                myns.types)",
   :var-type "macro",
   :line 2057,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:file "module-rt/src/main/clojure/clojure/core/typed.clj",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2237",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/var-coverage",
   :namespace "clojure.core.typed",
   :line 2237,
   :var-type "var",
   :doc
   "Summarises annotated var coverage statistics to *out*\nfor namespaces nsyms, a collection of symbols or a symbol/namespace.\nDefaults to the current namespace if no argument provided.",
   :name "var-coverage"}
  {:arglists ([sym]),
   :name "var>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2086",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/var>",
   :doc
   "Like var, but resolves at runtime like ns-resolve and is understood by\nthe type checker. sym must be fully qualified (without aliases).\n\neg. (var> clojure.core/+)",
   :var-type "macro",
   :line 2086,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([]),
   :name "warn-on-unannotated-vars",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj#L2100",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/b5af118e42e0a13b3a6334b3ac536c78ff7e9e4d/module-rt/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/warn-on-unannotated-vars",
   :doc
   "Allow unannotated vars in the current namespace. \n\nEmits a warning instead of a type error when checking\na def without a corresponding expected type.\n\nDisables automatic inference of `def` expressions.\n\neg. (warn-on-unannotated-vars)",
   :var-type "macro",
   :line 2100,
   :file "module-rt/src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([b & body]),
   :name "when-let-fail",
   :namespace "clojure.core.typed",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/when-let-fail",
   :doc
   "Like when-let, but fails if the binding yields a false value.",
   :var-type "macro",
   :line 192,
   :file "module-check/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([form expected expected-provided?]),
   :name "check-form-cljs",
   :namespace "clojure.core.typed.check-form-cljs",
   :source-url
   "https://github.com/clojure/core.typed/blob/0811ef9321f62be1ebab83c04b0f99620fd8e81e/module-check/src/main/clojure/clojure/core/typed/check_form_cljs.clj#L23",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/0811ef9321f62be1ebab83c04b0f99620fd8e81e/module-check/src/main/clojure/clojure/core/typed/check_form_cljs.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.check-form-cljs/check-form-cljs",
   :doc
   "Check a single form with an optional expected type.\nIntended to be called from Clojure. For evaluation at the Clojurescript\nREPL see cf.",
   :var-type "function",
   :line 23,
   :file
   "module-check/src/main/clojure/clojure/core/typed/check_form_cljs.clj"}
  {:arglists ([ns-or-syms & opt]),
   :name "check-ns-info",
   :namespace "clojure.core.typed.check-ns-clj",
   :source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/check_ns_clj.clj#L6",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/check_ns_clj.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.check-ns-clj/check-ns-info",
   :doc
   "Same as check-ns, but returns a map of results from type checking the\nnamespace.\n\nOptions\n- :collect-only    Don't type check the given namespace/s, but collect the \n                   top level type annotations like ann, ann-record.\n- :type-provided?  If true, use the expected type to check the form\n- :profile         Use Timbre to profile the type checker. Timbre must be\n                   added as a dependency.\n- :file-mapping    If true, return map provides entry :file-mapping, a hash-map\n                   of (Map '{:line Int :column Int :file Str} Str).",
   :var-type "function",
   :line 6,
   :file
   "module-check/src/main/clojure/clojure/core/typed/check_ns_clj.clj"}
  {:arglists ([nsym {:keys [ast-for-ns collect-asts collect-ns]}]),
   :name "collect-ns*",
   :namespace "clojure.core.typed.collect-utils",
   :source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/collect_utils.clj#L53",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/collect_utils.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.collect-utils/collect-ns*",
   :doc
   "Collect type annotations and dependency information\nfor namespace symbol nsym, and recursively check \ndeclared typed namespace dependencies.",
   :var-type "function",
   :line 53,
   :file
   "module-check/src/main/clojure/clojure/core/typed/collect_utils.clj"}
  {:arglists ([]),
   :name "->NoisyHole",
   :namespace "clojure.core.typed.hole",
   :source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/hole.clj#L17",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/hole.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.hole/->NoisyHole",
   :doc
   "Positional factory function for class clojure.core.typed.hole.NoisyHole.",
   :var-type "function",
   :line 17,
   :file "module-check/src/main/clojure/clojure/core/typed/hole.clj"}
  {:arglists ([]),
   :name "noisy-hole",
   :namespace "clojure.core.typed.hole",
   :source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/hole.clj#L20",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/hole.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.hole/noisy-hole",
   :doc
   "A noisy hole. The type system will complain when\n(noisy-hole) is used in positions that expect a type\nmore specific than Object or Any.\nUse (noisy-hole) as a placeholder for code.\nThrows an exception when evaluted.",
   :var-type "function",
   :line 20,
   :file "module-check/src/main/clojure/clojure/core/typed/hole.clj"}
  {:arglists ([]),
   :name "silent-hole",
   :namespace "clojure.core.typed.hole",
   :source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/hole.clj#L8",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/hole.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.hole/silent-hole",
   :doc
   "A silent hole. (silent-hole) passes for any other type\nwhen type checking.\nUse (silent-hole) as a placeholder for code.\nThrows an exception when evaluted.",
   :var-type "function",
   :line 8,
   :file "module-check/src/main/clojure/clojure/core/typed/hole.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.hole/NoisyHole",
   :namespace "clojure.core.typed.hole",
   :var-type "type",
   :name "NoisyHole"}
  {:arglists ([form ty]),
   :name "ann-form",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L123",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/ann-form",
   :doc "Annotate a form with an expected type.",
   :var-type "macro",
   :line 123,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([& args]),
   :name "atom",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L199",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/atom",
   :doc
   "Like atom, but with optional type annotations.\n\nSame as (atom (ann-form init t) args*)\n\neg. (atom 1) : (Atom1 (Value 1))\n    (atom :- Num, 1) : (Atom1 Num)",
   :var-type "macro",
   :line 199,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([name & fdecl]),
   :forms [(def name docstring? :- type? expr)],
   :name "def",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L22",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/def",
   :doc
   "Like clojure.core/def with optional type annotations\n\nNB: in Clojure it is impossible to refer a var called `def` as it is a\nspecial form. Use an alias prefix (eg. `t/def`).\n\nIf an annotation is provided, a corresponding `ann` form\nis generated, otherwise it expands identically to clojure.core/def\n\neg. ;same as clojure.core/def\n    (def vname 1)\n    \n    ;with Number `ann`\n    (def vname :- Number 1)\n\n    ;doc\n    (def vname\n      \"Docstring\"\n      :- Long\n      1)",
   :var-type "macro",
   :line 22,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([& args]),
   :forms
   [(defn poly? name docstring? [param :- type *] :- type exprs*)
    (defn poly? name docstring? ([param :- type *] :- type exprs*) +)],
   :name "defn",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L229",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/defn",
   :doc
   "Like defn, but with optional annotations. All annotations default to Any,\nlike the typed fn macro. Rest parameters default to starred.\n\neg. (defn fname [a :- Number, b :- (U Symbol nil)] :- Integer ...)\n\n;annotate return\n(defn fname [a :- String] :- String ...)\n\n;multi-arity\n(defn fname \n  ([a :- String] :- String ...)\n  ([a :- String, b :- Number] :- Long ...))",
   :var-type "macro",
   :line 229,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([& body]),
   :name "defprotocol",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L133",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/defprotocol",
   :doc
   "Like defprotocol, but with optional type annotations.\n\nOmitted annotations default to Any, except for the first\nparameter of a method which defaults to the current protocol\nbeing annotated (instantiated with any variables it has).\n\nAdd a binder before the protocol name to define a polymorphic\nprotocol. A binder before the method name defines a polymorphic\nmethod, however a method binder must not shadow type variables\nintroduced by a protocol binder.\n\nReturn types for each method arity can be annotated.\n\nUnlike clojure.core/defprotocol, successive methods can\nhave the same arity. Semantically, providing multiple successive\nmethods of the same arity is the same as just providing the left-most\nmethod. However the types for these methods will be accumulated into\na Fn type.\n\neg. ;annotate single method\n(defprotocol MyProtocol\n  (a [this a :- Integer] :- Number))\n\n;polymorphic protocol\n(defprotocol [[x :variance :covariant]]\n  MyProtocol\n  (a [this a :- Integer] :- Number))\n\n;multiple types for the same method\n(defprotocol [[x :variance :covariant]]\n  MyProtocol\n  (a [this a :- Integer] :- Integer\n     [this a :- Long] :- Long\n     [this a :- Number] :- Number))\n\n;polymorphic method+protocol\n(defprotocol [[x :variance :covariant]]\n  MyProtocol\n  ([y] a [this a :- x, b :- y] :- y))\n",
   :var-type "macro",
   :line 133,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([& forms]),
   :forms
   [(fn name? [param :- type* & param :- type * ?] :- type? exprs*)
    (fn
     name?
     ([param :- type* & param :- type * ?] :- type? exprs*)
     +)],
   :name "fn",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L56",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/fn",
   :doc
   "Like clojure.core/fn, but with optional annotations.\n\neg. ;these forms are equivalent\n    (fn [a] b)\n    (fn [a :- Any] b)\n    (fn [a :- Any] :- Any b)\n    (fn [a] :- Any b)\n\n    ;annotate return\n    (fn [a :- String] :- String body)\n\n    ;named fn\n    (fn fname [a :- String] :- String body)\n\n    ;rest parameter\n    (fn [a :- String & b :- Number *] body)\n\n    ;dotted rest parameter\n    (fn [a :- String & b :- Number ... x] body)\n\n    ;multi-arity\n    (fn fname \n      ([a :- String] :- String ...)\n      ([a :- String, b :- Number] :- String ...))",
   :var-type "macro",
   :line 56,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([bvec & forms]),
   :forms [(let [binding :- type? init*] exprs*)],
   :name "let",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L111",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/let",
   :doc
   "Like clojure.core/let but supports optional type annotations.\n\neg. (let [a :- Type, b\n          a2 1.2]\n      body)",
   :var-type "macro",
   :line 111,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([bindings & exprs]),
   :forms [(loop [binding :- type? init*] exprs*)],
   :name "loop",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L93",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/loop",
   :doc
   "Like clojure.core/loop, and supports optional type annotations.\nArguments default to a generalised type based on the initial value.\n\neg. (loop [a :- Number 1\n           b :- (U nil Number) nil]\n      ...)",
   :var-type "macro",
   :line 93,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([fdecl name]),
   :name "parse-colon",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L14",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/parse-colon",
   :doc "Returns a vector of [provided? t args]",
   :var-type "function",
   :line 14,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([& args]),
   :name "ref",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L214",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/ref",
   :doc
   "Like ref, but with optional type annotations.\n\nSame as (ref (ann-form init t) args*)\n\neg. (ref 1) : (Ref1 (Value 1))\n    (ref :- Num, 1) : (Ref1 Num)",
   :var-type "macro",
   :line 214,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([& body]),
   :name "tc-ignore",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L180",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/tc-ignore",
   :doc "Ignore forms in body during type checking",
   :var-type "macro",
   :line 180,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([b & body]),
   :name "when-let-fail",
   :namespace "clojure.core.typed.macros",
   :source-url
   "https://github.com/clojure/core.typed/blob/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj#L192",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/1f68cc837a20c1c049f7f1d98f79f9e99a1abb09/module-rt/src/main/clojure/clojure/core/typed/macros.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.macros/when-let-fail",
   :doc
   "Like when-let, but fails if the binding yields a false value.",
   :var-type "macro",
   :line 192,
   :file "module-rt/src/main/clojure/clojure/core/typed/macros.clj"}
  {:arglists ([nsyms]),
   :name "statistics",
   :namespace "clojure.core.typed.statistics",
   :source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/statistics.clj#L22",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-check/src/main/clojure/clojure/core/typed/statistics.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.statistics/statistics",
   :doc
   "Takes a collection of namespace symbols and returns a map mapping the namespace\nsymbols to a map of data",
   :var-type "function",
   :line 22,
   :file
   "module-check/src/main/clojure/clojure/core/typed/statistics.clj"}
  {:name "*checking*",
   :namespace "clojure.core.typed.util-vars",
   :source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-rt/src/main/clojure/clojure/core/typed/util_vars.clj#L37",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-rt/src/main/clojure/clojure/core/typed/util_vars.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.util-vars/*checking*",
   :doc "True during type checking.",
   :var-type "var",
   :line 37,
   :file "module-rt/src/main/clojure/clojure/core/typed/util_vars.clj"}
  {:name "*trace-checker*",
   :namespace "clojure.core.typed.util-vars",
   :source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-rt/src/main/clojure/clojure/core/typed/util_vars.clj#L31",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-rt/src/main/clojure/clojure/core/typed/util_vars.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.util-vars/*trace-checker*",
   :doc "If true, print tracing information during type checking.",
   :var-type "var",
   :line 31,
   :file "module-rt/src/main/clojure/clojure/core/typed/util_vars.clj"}
  {:name "*verbose-forms*",
   :namespace "clojure.core.typed.util-vars",
   :source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-rt/src/main/clojure/clojure/core/typed/util_vars.clj#L19",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-rt/src/main/clojure/clojure/core/typed/util_vars.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.util-vars/*verbose-forms*",
   :doc
   "If true, print complete forms in error messages. Bind\naround a type checking form like cf or check-ns.\n\neg.\n(binding [*verbose-forms* true]\n  (cf ['deep ['deep ['deep ['deep]]]] Number))\n;=> <full form in error>",
   :var-type "var",
   :line 19,
   :file "module-rt/src/main/clojure/clojure/core/typed/util_vars.clj"}
  {:name "*verbose-types*",
   :namespace "clojure.core.typed.util-vars",
   :source-url
   "https://github.com/clojure/core.typed/blob/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-rt/src/main/clojure/clojure/core/typed/util_vars.clj#L6",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/05369b9cbc4c9a26a79c0c97fcc161bfb723408c/module-rt/src/main/clojure/clojure/core/typed/util_vars.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.util-vars/*verbose-types*",
   :doc
   "If true, print fully qualified types in error messages\nand return values. Bind around a type checking form like \ncf or check-ns.\n\neg. \n(binding [*verbose-types* true] \n  (cf 1 Number))\n;=> java.lang.Number",
   :var-type "var",
   :line 6,
   :file
   "module-rt/src/main/clojure/clojure/core/typed/util_vars.clj"})}
