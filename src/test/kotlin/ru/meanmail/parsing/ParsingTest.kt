package ru.meanmail.parsing

import com.intellij.testFramework.ParsingTestCase
import ru.meanmail.lang.RequirementsParserDefinition

class ParsingTest : ParsingTestCase(
    "testData", "requirements.txt", RequirementsParserDefinition()
) {
    fun testConstraint() {
        doTest(true)
    }

    fun testEditable() {
        doTest(true)
    }

    fun testEscapeNewLine() {
        doTest(true)
    }

    fun testExtraIndexUrl() {
        doTest(true)
    }

    fun testHash() {
        doTest(true)
    }

    fun testIndexUrl() {
        doTest(true)
    }

    fun testLocalPathReq() {
        doTest(true)
    }

    fun testNameReq() {
        doTest(true)
    }

    fun testNoBinary() {
        doTest(true)
    }

    fun testOnePackage() {
        doTest(true)
    }

    fun testNoIndex() {
        doTest(true)
    }

    fun testOnlyBinary() {
        doTest(true)
    }

    fun testPathReq() {
        doTest(true)
    }

    fun testPathReqWithEnvVar() {
        doTest(true)
    }

    fun testPre() {
        doTest(true)
    }

    fun testPreferBinary() {
        doTest(true)
    }

    fun testRequireHashes() {
        doTest(true)
    }

    fun testRequirement() {
        doTest(true)
    }

    fun testSysPlatform() {
        doTest(true)
    }

    fun testTrustedHost() {
        doTest(true)
    }

    fun testUseFeature() {
        doTest(true)
    }

    override fun getTestDataPath(): String {
        return "src/test/resources/" +
                this.javaClass.packageName.replace(".", "/")
    }

    override fun skipSpaces(): Boolean {
        return false
    }

    override fun includeRanges(): Boolean {
        return true
    }
}
