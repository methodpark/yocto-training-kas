# poky-tiny-kas

hopefully small poky-tiny image built with kas

## usage

```sh
# clone kas
git clone https://github.com/siemens/kas

# run bitbake shell
~/path/to/kas/kas-container shell

# build image
~/path/to/kas/kas-container build
```

 - also use `.../kas-container help`
 - the config is in `.config.yaml` by default, i guess we can move it if
   hidden file is too implicit
```

# run qemu on image

```
# in kas-container shell
runqemu slirp nographic serialstdio
```

Login with user `root`, no password.

To exit the qemu process, use Ctrl+a x.

