object EmailFormatter extends App {
  def textFormatter(text: String, limit: Int): String = {
    val words = text.split("\\s+")
    val paragraph = new StringBuilder
    val row = new StringBuilder
    var currentWord = ""

    def lineLimitExceeded(): Boolean = {
      return row.length() + currentWord.length() + 1 > limit
    }

    def appendLineSeparatorOnParagraph(): Unit = {
      if (paragraph.nonEmpty) {
        paragraph.append("\n")
      }
    }

    def appendLineSeparatorInParagraph(): Unit = {
      if (paragraph.nonEmpty) {
        paragraph.append("\n")
      }
    }

    def goThroughWordByWord(): Unit = {
      for (w <- words) {
        currentWord = w

        if (lineLimitExceeded()) {
          appendLineSeparatorInParagraph()
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
      appendLineSeparatorOnParagraph()
      paragraph.append(row)
    }

    return paragraph.toString
  }
}