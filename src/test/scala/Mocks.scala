object Mocks {

  val text_scenario8 = "One two three four five six seven eight nine ten"
  val limit_scenario8 = 5
  val expected_result_scenario8 = "One\ntwo\nthree\nfour\nfive\nsix\nseven\neight\nnine\nten"

  val text_scenario7 = "Crabbed Age and Youth Cannot live together: Youth is full of pleasance, Age is full of care"
  val limit_scenario7 = 17
  val expected_result_scenario7 = "Crabbed Age and\nYouth Cannot live\ntogether: Youth\nis full of\npleasance, Age is\nfull of care"

  val text_scenario6 = "Youth like summer morn, Age like winter weather; Youth like summer brave, Age like winter bare:"
  val limit_scenario6 = 10
  val expected_result_scenario6 = "Youth like\nsummer\nmorn, Age\nlike\nwinter\nweather;\nYouth like\nsummer\nbrave, Age\nlike\nwinter\nbare:"

  val text_scenario5 = "Youth is full of sports, Age's breath is short, Youth is nimble, Age is lame: Youth is hot and bold, Age is weak and cold,"
  val limit_scenario5 = 12
  val expected_result_scenario5 = "Youth is\nfull of\nsports,\nAge's breath\nis short,\nYouth is\nnimble, Age\nis lame:\nYouth is hot\nand bold,\nAge is weak\nand cold,"

  val text_scenario4 = "Youth is wild, and Age is tame:- Age, I do abhor thee; Youth, I do adore thee; O! my Love, my Love is young! Age, I do defy thee- O sweet shepherd, hie thee, For methinks thou stay'st too long."
  val limit_scenario4 = 20
  val expected_result_scenario4 = "Youth is wild, and\nAge is tame:- Age, I\ndo abhor thee;\nYouth, I do adore\nthee; O! my Love, my\nLove is young! Age,\nI do defy thee- O\nsweet shepherd, hie\nthee, For methinks\nthou stay'st too\nlong."

  val text_scenario3 = "Sadly, a kernel by itself gets you nowhere. To get a working system you need a shell, compilers, a library etc. These are separate parts and may be under a stricter (or even looser) copyright. Most of the tools used with linux are GNU software and are under the GNU copyleft. These tools aren't in the distribution - ask me (or GNU) for more info."
  val limit_scenario3 = 45
  val expected_result_scenario3 = "Sadly, a kernel by itself gets you nowhere." +
    "\nTo get a working system you need a shell," +
    "\ncompilers, a library etc. These are separate" +
    "\nparts and may be under a stricter (or even" +
    "\nlooser) copyright. Most of the tools used" +
    "\nwith linux are GNU software and are under the" +
    "\nGNU copyleft. These tools aren't in the" +
    "\ndistribution - ask me (or GNU) for more info."

  val text_scenario2 = "After AT&T had dropped out of the Multics project, the Unix operating system was conceived and implemented by Ken Thompson and Dennis Ritchie (both of AT&T Bell Laboratories) in 1969 and first released in 1970. Later they rewrote it in a new programming language, C, to make it portable. The availability and portability of Unix caused it to be widely adopted, copied and modified by academic institutions and businesses."
  val limit_scenario2 = 40
  val expected_result_scenario2 = "After AT&T had dropped out of the" +
    "\nMultics project, the Unix operating" +
    "\nsystem was conceived and implemented by" +
    "\nKen Thompson and Dennis Ritchie (both of" +
    "\nAT&T Bell Laboratories) in 1969 and" +
    "\nfirst released in 1970. Later they" +
    "\nrewrote it in a new programming" +
    "\nlanguage, C, to make it portable. The" +
    "\navailability and portability of Unix" +
    "\ncaused it to be widely adopted, copied" +
    "\nand modified by academic institutions" +
    "\nand businesses."

  val text_scenario1 = "In 1991, while studying computer science at University of Helsinki, Linus Torvalds began a project that later became the Linux kernel. He wrote the program specifically for the hardware he was using and independent of an operating system because he wanted to use the functions of his new PC with an 80386 processor. Development was done on MINIX using the GNU C Compiler."
  val limit_scenario1 = 40
  val expected_result_scenario1 = "In 1991, while studying computer science" +
    "\nat University of Helsinki, Linus" +
    "\nTorvalds began a project that later" +
    "\nbecame the Linux kernel. He wrote the" +
    "\nprogram specifically for the hardware he" +
    "\nwas using and independent of an" +
    "\noperating system because he wanted to" +
    "\nuse the functions of his new PC with an" +
    "\n80386 processor. Development was done on" +
    "\nMINIX using the GNU C Compiler."
}
