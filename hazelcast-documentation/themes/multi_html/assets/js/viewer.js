// Generated by CoffeeScript 1.6.3
(function () {
    $(function () {
        if (typeof hljs !== "undefined" && hljs !== null) {
            $('#content pre code').each(function (i, el) {
                return hljs.highlightBlock(el);
            });
        }
        if (window.location.search.indexOf('print') !== -1) {
            return window.print();
        }
    });

}).call(this);
