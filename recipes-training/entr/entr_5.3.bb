SUMMARY = "Tool to run arbitrary commands when files change"
HOMEPAGE = "https://github.com/eradman/entr"

SRC_URI = "https://github.com/eradman/entr/archive/refs/tags/5.3.tar.gz"

do_configure() {
    cd "${WORKDIR}/entr-5.3"
    ./configure
}

do_compile() {
    cd "${WORKDIR}/entr-5.3"
    make
}

do_install() {
    cd "${WORKDIR}/entr-5.3"
    make DESTDIR=${D} PREFIX=/usr install
}

# why three separate steps? -> caching, parallism, ..
