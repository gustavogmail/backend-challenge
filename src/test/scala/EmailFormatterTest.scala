import org.scalatest.funsuite.AnyFunSuite

class EmailFormatterTest extends AnyFunSuite {
  test("Scenario 5") {
    /*
    Scenario 8:
    GIVEN the text is "One two three four five six seven eight nine ten" AND
    GIVEN the limit is 5
    WHEN the textFormatter is called
    THEN the return is "One\ntwo\nthree\nfour\nfive\nsix\nseven\neight\nnine\nten"
    */
    assert(
      EmailFormatter.textFormatter(
        Mocks.text_scenario8,
        Mocks.limit_scenario8
      ) === Mocks.expected_result_scenario8
    )
  }

  test("Scenario 4") {
    /*
    Scenario 4:
    GIVEN the text is
    AND GIVEN the limit is
    WHEN the textFormatter is called
    THEN the return is
    */
    assert(
      EmailFormatter.textFormatter(
        Mocks.text_scenario4,
        Mocks.limit_scenario4
      ) === Mocks.expected_result_scenario4
    )
  }

  test("Scenario 3") {
    /*
    Scenario 3:
    GIVEN the text is "Sadly, a kernel by itself gets you nowhere. To get a working system you need a shell, compilers, a library etc. These are separate parts and may be under a stricter (or even looser) copyright. Most of the tools used with linux are GNU software and are under the GNU copyleft. These tools aren't in the distribution - ask me (or GNU) for more info."
    AND GIVEN the limit is 45
    WHEN the textFormatter is called
    THEN the return is
      "Sadly, a kernel by itself gets you nowhere.
      To get a working system you need a shell,
      compilers, a library etc. These are separate
      parts and may be under a stricter (or even
      looser) copyright. Most of the tools used
      with linux are GNU software and are under the
      GNU copyleft. These tools aren't in the
      distribution - ask me (or GNU) for more info."
    */
    assert(
      EmailFormatter.textFormatter(
        Mocks.text_scenario3,
        Mocks.limit_scenario3
      ) === Mocks.expected_result_scenario3
    )
  }

  test("Scenario 2") {
    /*
    Scenario 2:
      GIVEN the text is "After AT&T had dropped out of the Multics project, the Unix operating system was conceived and implemented by Ken Thompson and Dennis Ritchie (both of AT&T Bell Laboratories) in 1969 and first released in 1970. Later they rewrote it in a new programming language, C, to make it portable. The availability and portability of Unix caused it to be widely adopted, copied and modified by academic institutions and businesses."
      AND GIVEN the limit is 40
      WHEN the textFormatter is called
      THEN the return is
        "After AT&T had dropped out of the
        Multics project, the Unix operating
        system was conceived and implemented by
        Ken Thompson and Dennis Ritchie (both of
        AT&T Bell Laboratories) in 1969 and
        first released in 1970. Later they
        rewrote it in a new programming
        language, C, to make it portable. The
        availability and portability of Unix
        caused it to be widely adopted, copied
        and modified by academic institutions
        and businesses."
    */
    assert(
      EmailFormatter.textFormatter(
        Mocks.text_scenario2,
        Mocks.limit_scenario2
      ) === Mocks.expected_result_scenario2
    )
  }

  test("Scenario 1") {
    /*
    Scenario 1:
      GIVEN the text is "In 1991, while studying computer science at University of Helsinki, Linus Torvalds began a project that later became the Linux kernel. He wrote the program specifically for the hardware he was using and independent of an operating system because he wanted to use the functions of his new PC with an 80386 processor. Development was done on MINIX using the GNU C Compiler."
      AND GIVEN the limit is 40
      WHEN the textFormatter is called
      THEN the return is
        "In 1991, while studying computer science
        at University of Helsinki, Linus
        Torvalds began a project that later
        became the Linux kernel. He wrote the
        program specifically for the hardware he
        was using and independent of an
        operating system because he wanted to
        use the functions of his new PC with an
        80386 processor. Development was done on
        MINIX using the GNU C Compiler."
    */
    assert(
      EmailFormatter.textFormatter(
        Mocks.text_scenario1,
        Mocks.limit_scenario1
      ) === Mocks.expected_result_scenario1
    )
  }
}