Jenkins.instance.getItemByFullName('pipeline_CI').builds.findAll { it.number >= 1 && it.number <= 10000 }.each { it.delete() }
Jenkins.instance.getItemByFullName('pipeline_CI').updateNextBuildNumber(1)
