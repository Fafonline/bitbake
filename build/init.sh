git ls-remote http://tfs2017:8080/tfs/DefaultCollection/_git/BAGUERA >/dev/null
export BBPATH=${PWD}

export BB_ENV_EXTRAWHITE="$BB_ENV_EXTRAWHITE 
PKG_CONFIG_PATH \
BAGUERA_NG_ROOT_DIR \
HTTP_PROXY \
HTTPS_PROXY \
FTP_PROXY \
http_proxy \
https_proxy \
no_proxy\
"

