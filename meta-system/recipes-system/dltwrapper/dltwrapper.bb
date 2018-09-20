DESCRIPTION = "DLT logger wrapper"
DEPENDS = "dlt-daemon"

PN = "dltwrapper"

#SRCREV="824084a85137f71baa4cb160e97212a6ecdc4df9"
SRCREV= "master"
SRC_URI="http://tfs2017:8080/tfs/DefaultCollection/BAGUERA/_git/system"

S = "${WORKDIR}/${PN}-${PV}-${PR}/dltwrapper"

inherit cmake