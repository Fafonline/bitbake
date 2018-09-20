DESCRIPTION = "DLT: Diagnostic Log and trace"
DEPENDS = ""

PN = "dlt-daemon"

SRCREV= "e1560eba378d1916a0a4eba2a54c9085fed49703"
SRC_URI="https://github.com/GENIVI/dlt-daemon.git"

S = "${WORKDIR}/${PN}-${PV}-${PR}"

inherit cmake
EXTRA_CMAKE +="-DWITH_DLT_DBUS=OFF"