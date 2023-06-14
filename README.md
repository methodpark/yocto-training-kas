# poky-tiny-kas

hopefully small poky-tiny image built with kas

## usage

```sh
# clone this repository
git clone https://code.methodpark.de/mp-eng/yocto-training-kas.git

# clone kas
# on same level where yocto-training-kas originates
git clone https://github.com/siemens/kas



# run bitbake shell
# from inside yocto-training-kas
cd yocto-kas-container
~/path/to/kas/kas-container shell

# build image
~/path/to/kas/kas-container build

# build only entr recipe
~/path/to/kas/kas-container shell
builder@aa2c6b960dda:/build$ bitbake entr
```

 - also use `.../kas-container help`
 - the config is in `.config.yaml` by default, i guess we can move it if
   hidden file is too implicit


# run qemu on image

```
# in kas-container shell
runqemu slirp nographic serialstdio
```

Login with user `root`, no password.

To exit the qemu process, use Ctrl+a x.

