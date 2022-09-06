object EmailFormatter {
  def textFormatter(text: String, limit: Int): String = {
    val words = text.split("\\s+")
    val paragraph = new StringBuilder
    val row = new StringBuilder
    var currentWord = ""

    def lineLimitExceeded(): Boolean = {
      return row.length() + currentWord.length() + 1 > limit
    }

    def appendLineBreakInParagraph(): Unit = {
      if (paragraph.nonEmpty) {
        paragraph.append("\n")
      }
    }

    def goThroughWordByWord(): Unit = {
      for (w <- words) {
        currentWord = w

        if (lineLimitExceeded()) {
          appendLineBreakInParagraph()
          paragraph.append(row.toString)
          row.setLength(0)
        }

        if (row.nonEmpty) {
          row.append(' ')
        }
        row.append(w)
      }
    }

    goThroughWordByWord()

    if (row.nonEmpty) {
      appendLineBreakInParagraph()
      paragraph.append(row)
    }

    return paragraph.toString
  }
}