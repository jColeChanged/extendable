(ns extendable.core
  (:require [clojure.contrib.duck-streams :as duck]))

(defn create-settings
  [{:keys [folder command time delay sleep]}]
  (duck/write-lines (str folder "settings.txt") [command time delay sleep]))

(defn create-questions
  [{:keys [folder qanda]}]
  (duck/write-lines (str folder "questions.txt") (flatten qanda)))

(defn create-folder
  [{:keys [folder]}]
  (duck/make-parents (java.io.File. (str folder "dummy.txt"))))

(defn extendable-game
  [game]
  (do
    (create-folder game) ; create folder must come first
    (create-settings game)
    (create-questions game)))
