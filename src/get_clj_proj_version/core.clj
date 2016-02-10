(ns get-clj-proj-version.core
  (:gen-class))

(defn -main [& args]
  (when (< (count args) 1)
    (throw (Exception. "missing arg of path to project")))
  (println (-> (format "%s/project.clj" (first args)) slurp read-string (nth 2))))
