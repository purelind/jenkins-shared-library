boolean call(List<String> branchs, String targetBranch) {
    branchs.each {branch ->
        println branch
        if (targetBranch.startsWith(branch)) {
            return true
        }
    }
    return false
}