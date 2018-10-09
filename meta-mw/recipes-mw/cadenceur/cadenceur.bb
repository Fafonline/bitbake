DESCRIPTION = "Baguera-ng  cadenceur"
DEPENDS = "PCIeAccess dltwrapper"

PN = "cadenceur"
#SRCREV="824084a85137f71baa4cb160e97212a6ecdc4df9"

SRCREV= "--track origin/FAL_DEV-bitbake"
SRC_URI="http://tfs2017:8080/tfs/DefaultCollection/_git/BAGUERA"

S = "${WORKDIR}/${PN}-${PV}-${PR}/src/cadenceur"

inherit cmake
