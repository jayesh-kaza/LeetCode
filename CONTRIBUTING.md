# Contributing to this Repo

If you're reading this, you're awesome! Thank you for helping in making this repository grow. Here are a few guidelines that will help you along the way.

## Your first Pull Request

Working on your first Pull Request?

Here are a few guidelines : 

If you decide to fix an issue, please be sure to check the comment thread in case somebody is already working on a fix. If nobody is working on it at the moment, please leave a comment stating that you have started to work on it so other people don’t accidentally duplicate your effort.

If somebody claims an issue but doesn’t follow up for more than a week, it’s fine to take it over but you should still leave a comment.

**Note** : For All label indicates that the issue is open for all ! :)

## Sending a Pull Request

When in doubt, keep your Pull Requests small.

1. Fork the repository.

2. Clone the fork to your local machine and add upstream remote

```sh
git clone https://github.com/<yourname>/LeetCode.git
cd LeetCode
git remote add upstream https://github.com/jayesh-kaza/LeetCode.git
```

3. Synchronize your local `master` branch with the upstream one:

```sh
git checkout master
git pull upstream master
```

4. Create a new topic branch:

```sh
git checkout -b my-topic-branch
```

5. Make changes, commit and push to your fork:

```sh
git push -u
```

6. Go to [the repository](https://github.com/jayesh-kaza/LeetCode.git) and make a Pull Request.

I will review your Pull Request and either merge it, request changes to it, or close it with an explanation.

7. Follow the naming convention of the files. 

 **Example**
```
 <problem_number>_<problem_name>.java
```

