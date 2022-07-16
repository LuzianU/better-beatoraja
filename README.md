# BetterBeatoraja
## Features
- option to disable illegal song check on launch
- option to enable auto scratch assist


- skin now updates instantly without having to reload the scene
- fixed performance of opening folders and custom database search filters such as density, scratch percentage, etc.
- in song select, key 4 now selects (but does not instantly play) a randomly selected song


# beatoraja
Codename beatoraja is a Cross-platform rhythm game based on Java and libGDX.
It works on Windows, Mac OS, and Linux.

# Features
- 3 types of Long Note mode : Long Notes, Charge Notes, Hell Charge Notes, and Back Spin Scratch like iidx
- show note timing duration (like iidx green number), judge details (fast/slow or +-ms)
- 8 types of groove gauge (ex. assist-easy, ex-hard, ex-grade)
- 11 types of clear lamp (ex. assist, light-assist, ex-hard, perfect, and max)
- real-time play speed controller (x0.25 - x4.0. auto play mode, replay mode only)
- various assist options : legacy note, expand judge, bpm guide, and no mine
- pms judge (max 1 miss / 1 notes, combo is reset when miss)
- support bmson 0.2.1, 1.0.0
- practice mode
- import difficulty table folder, create course with various constraint (mirror/random OK, no hispeed, and so on)
- import LunaticRave2 skin (now working in progress. not supporting DirectXArchive(.dxa) and DirectDrawSurface(.dds) file)
- import LunaticRave2 scores (clear lamp, score. not including score verifier like scorehash)

# System Requirement
- Java Runtime Environment 1.8.0 64bit (32bit is not recommended)
- OpenGL 3.1- (may not work under Windows 10 + Intel HD Graphics 2000/3000. See also https://github.com/LWJGL/lwjgl/issues/119)

# How To Use

> java -jar beatoraja.jar -(a|p|r1|r2|r3|r4|s) [BMS path]

- options
  - a : autoplay
  - p : practice
  - r1-r4 : start replay data 1-4
  - s : skip configuration

beatoraja uses a large amount of heap memory. So it is recommended that you use options of extending heap memory : e.g. -Xms1g -Xmx4g.

On JRE 32bit, maximum heap memory size is limited to 1.4G-1.6G. See http://www.oracle.com/technetwork/java/hotspotfaq-138619.html#gc_heap_32bit

**Don't use this application for playing copyrighted contents.**

# License
- GNU General Public License v3
