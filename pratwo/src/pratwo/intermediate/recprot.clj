(ns pratwo.intermediate.recprot)

(defprotocol ICall
  (name-calling [this])
  (status [this])
  (say-something [this remark]))

(defprotocol GetScore
  (score [this])
  (increase [this change]))

(defrecord Person [nama age score status]
  ICall
  (name-calling [this]
    (get this :nama))
  (status [this]
    (get this :status))
  (say-something [this remark]
    (str "Woi njing " remark " " (get this :nama)))

  GetScore
  (score [this]
    (get this :score))
  (increase [this change]
    (+ change (get this :score))))

(defrecord Thing [nama price status]
  ICall
  (name-calling [this]
    (str "Ho hoi " (get this :nama)))
  (status [this]
    (get this :status))
  (say-something [this remark]
    (str remark " " (get this :nama))))
